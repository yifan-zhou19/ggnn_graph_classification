package <missing>;

public class GlobalMembers
{
	public static int fei(int m)
	{
		if (m == 1)
		{
			return 1;
		}
		if (m == 2)
		{
			return 1;
		}
		return fei(m - 1) + fei(m - 2);
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20];
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = fei(a[i]);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}

}

