package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 13, 31 + 13, 31 + 28 + 13, 28 + 2 * 31 + 13, 28 + 30 + 2 * 31 + 13, 28 + 30 + 3 * 31 + 13, 28 + 2 * 30 + 3 * 31 + 13, 28 + 30 * 2 + 4 * 31 + 13, 28 + 2 * 30 + 5 * 31 + 13, 28 + 3 * 30 + 5 * 31 + 13, 28 + 3 * 30 + 6 * 31 + 13, 28 + 4 * 30 + 6 * 31 + 13};
		 for (i = 1;i <= 12;i++)
		 {
			 if ((a[i] % 7 + k - 1) % 7 == 5)
			 {
				 System.out.print(i);
				 System.out.print("\n");
			 }
		 }
		 return 0;
	}
}

