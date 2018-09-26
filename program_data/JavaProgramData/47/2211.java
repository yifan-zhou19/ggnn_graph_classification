package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100]; //??????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int i = 0;i <= n - 1;i++) //?????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print("\n");
		for (int k = n - 1;k >= 1;k--) //?????????
		{
			System.out.print(a[k]);
			System.out.print(" ");
		}
			 System.out.print(a[0]);
		System.out.print("\n");
		return 0;
	}
}

