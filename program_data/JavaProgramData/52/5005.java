package <missing>;

public class GlobalMembers
{
	////////////////////////
	//???????      //
	//??????        //
	//???1200012823    //
	//???2012?11?30?//
	//????????    //
	////////////////////////


	// ???????fromP???blockSize??????targetP
	public static void BlockMove(tangible.RefObject<Integer> fromP, tangible.RefObject<Integer> targetP, int blockSize)
	{
		if (blockSize == 0)
		{
			return;
		}
		for (int i = 0; i < blockSize; i++) // ????
		{
			*(targetP.argValue + i) = *(fromP.argValue + i);
		}
	}

	public static int Main()
	{
		int m;
		int i;
		int[] nums = new int[200];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			nums[i + 100] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		BlockMove(nums + 100 + n - m, nums + 100 - m, m); // ????m???????100?????
		System.out.print(nums[100 - m]);
		for (i = 1; i < n; i++)
		{
			System.out.print(' ');
			System.out.print(nums[100 - m + i]);
		}
		return 0;
	}
}

