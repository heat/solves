
public class ProductArrayExceptSelf {


    public static int[] productArrayExceptSelf(int[] nums) {

        int[] memo = new int[nums.length];

        productArrayRecursive(nums, 0, memo);

        return nums;
    }


    public static int productArrayRecursive(int[] args, int i, int[] memo) {


        if (i == args.length - 1) {
            int r = args[i];
            args[i] = memo[i - 1];
            return r;
        }

        if (i == 0) {
            memo[i] = args[i];
            int v = productArrayRecursive(args, i + 1, memo);
            args[i] = v;
            return v;
        }

        memo[i] = memo[i -1] * args[i];
        int acc = productArrayRecursive(args, i + 1, memo);
        int r = args[i];
        args[i] = memo[i - 1] * acc;
        return r * acc;
    }
}
