package <missing>;

public class GlobalMembers
{
	 public static int[] a = new int[100];
	public static int f(int n)
	{
		for (int i = n - 1;i >= 0;i--)
		{
		if (a[i] == 0)
		{
		System.out.print(i);
		System.out.print(' ');
		System.out.print(n);
		System.out.print("\n");
		a[i] = -1;
		break;
		}
		}
	}
	public static int Main()
	{
		String c = new String(new char[100]);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a[0] = 0;
		int i;
		int k = c.length();
		for (i = 1;i < k;i++)
		{
		if (c.charAt(i) == c.charAt(0))
		{
			a[i] = 0;
		}
		else
		{
			a[i] = 1;
		}
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] == 1)
			{
				f(i);
			}
		}
		return 0;
	}

}

