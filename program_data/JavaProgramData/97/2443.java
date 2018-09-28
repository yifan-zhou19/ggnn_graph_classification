package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????????
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 5;i++) //????????????????
		{
				System.out.print((n - n % a[i]) / a[i]);
				System.out.print("\n");
			n = n % a[i];
		}
		return 0;
	}
}

