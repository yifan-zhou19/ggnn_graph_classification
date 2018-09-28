package <missing>;

public class GlobalMembers
{
	public static int huiwen(String a, int m, int n)
	{
		int i;
		while (m < n)
		{
			if (!a[m].equals(a[n]))
			{
				return 0;
				break;
			}
			else
			{
				m++;
				n--;
			}
		}
		if (m >= n)
		{
			return 1;
		}
	}
	public static void print(String a, int m, int n)
	{
		int i;
		for (i = m;i <= n;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 2;i <= l;i++)
		{
			for (j = 0;j <= l - i;j++)
			{
				if (huiwen(a, j, j + i - 1) == 1)
				{
					print(a, j, j + i - 1);
				}
			}
		}
	}

}
