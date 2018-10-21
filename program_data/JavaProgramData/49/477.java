package <missing>;

public class GlobalMembers
{
	public static void huiwen(int i, int l, String a)
	{
		int j;
		int k;
		int flag = 0;
		for (j = 0; j <= l - i; j++)
		{
			flag = 1;
			for (k = 0; k <= i - 1; k++)
			{
				if (!a[j + k].equals(a[j + i - 1 - k]))
				{
					flag = 0;
				}
			}
			if (flag != 0)
			{
				for (k = 0; k <= i - 1; k++)
				{
					System.out.print(a[j + k]);
				}
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int l;
		l = a.length();
		for (i = 2; i <= l; i++)
		{
			huiwen(i, l, a);
		}
		return 0;
	}

}

