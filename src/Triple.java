public class Triple<L, M, R> {
    // fields
    private L left;
    private M middle;
    private R right;

    // constructor
    public Triple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    // getters and setters
    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public M getMiddle() {
        return middle;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + middle + ", " + right + ")";
    }
}
