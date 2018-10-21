package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		int t = a;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",t(a[i]));
		}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static t(a UnnamedParameter)
	{
		int[] b = new int[100];
		int i;
		int j;
		int n;
		int c = 0;
		int q = n;
		for (i = 0;a != 0;i++)
		{
			b[i] = a % 10;
			a = a / 10;
		}
		for (j = 0;j < i;j++)
		{
			c = c + b[j] * q(i - 1 - j);
		}
		return (c);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static q(n UnnamedParameter)
	{
		int i;
		int a = 1;
		for (i = 0;i < n;i++)
		{
			a = a * 10;
		}
		return (a);
	}









}

