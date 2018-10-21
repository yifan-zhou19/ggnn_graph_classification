package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		int i = 0;
		int[] a = new int[10000];
		a[0] = 1;
		a[1] = 1;
		for (i = 2;i < 10000;i++)
		{
			a[i] = 0;
		}
		for (i = 2;i < 10000;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[10000]; //?????????????????
		for (i = 0;i < 10000;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(a[b[i] - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

