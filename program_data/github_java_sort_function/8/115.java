 private static int partition(int[] nums, int low, int high) {

        int pivot = nums[high], i = low - 1;

        for (int j = low; j < high; j++) {

            if (nums[j] <= pivot) {

                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }

        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;

    }

    public static void quickSort(int[] nums, int low, int high) {

        if (low < high) {

            int index = partition(nums, low, high);

            quickSort(nums, low, index - 1);
            quickSort(nums, index + 1, high);

        }

    }