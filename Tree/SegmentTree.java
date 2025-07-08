package Tree;

public class SegmentTree {
    int[] seg;
    int n;
    public SegmentTree(int[] arr) {
        n = arr.length;
        seg = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }

    private void build(int[] arr, int index, int low, int high) {
        if (low == high) {
            seg[index] = arr[low];
            return;
        }
        int mid = low + (high - low) / 2;
        build(arr, 2 * index + 1, low, mid);
        build(arr, 2 * index + 2, mid + 1, high);
        seg[index] = seg[2 * index + 1] + seg[2 * index + 2];
    }

    public int query(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }

    private int query(int index, int low, int high, int l, int r) {
        if (r < low || high < l) return 0; // no overlap
        if (l <= low && high <= r) return seg[index]; // complete overlap
        int mid = low + (high - low) / 2;
        int left = query(2 * index + 1, low, mid, l, r);
        int right = query(2 * index + 2, mid + 1, high, l, r);
        return left + right;
    }

    public void update(int i, int val) {
        update(0, 0, n - 1, i, val);
    }

    private void update(int index, int low, int high, int i, int val) {
        if (low == high) {
            seg[index] = val;
            return;
        }
        int mid = low + (high - low) / 2;
        if (i <= mid)
            update(2 * index + 1, low, mid, i, val);
        else
            update(2 * index + 2, mid + 1, high, i, val);
        seg[index] = seg[2 * index + 1] + seg[2 * index + 2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree st = new SegmentTree(arr);

        System.out.println(st.query(1, 3)); // sum from index 1 to 3 → 3 + 5 + 7 = 15

        st.update(1, 10); // update index 1 to value 10

        System.out.println(st.query(1, 3)); // new sum → 10 + 5 + 7 = 22
    }
}