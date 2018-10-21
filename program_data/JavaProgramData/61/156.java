package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int N = 0;
		int n = 0;
		int i = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= 20;i++)
		{
		   a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 1;i <= N;i++)
		{
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(a[n]);
		   System.out.print("\n");
		}
		return 0;
	}

}

