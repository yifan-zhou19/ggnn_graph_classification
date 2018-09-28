package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[100];
	public static int f(int[] a, int[] b)
	{
		int i;
		int[] d = new int[100];
		for (i = 0;i < 100;i++)
		{
			d[i] = 0;
		}
		for (i = 0;i < 100;i++)
		{
						  if (a[i] + b[i] + d[i] >= 10)
						  {
						   c[i] = (a[i] + b[i] + d[i]) % 10;
						   d[i + 1] = 1;
						  }
						  else
						  {
						  c[i] = a[i] + b[i] + d[i];
						  }
		}
		return 0;
	}
	public static int Main()
	{
		int[] a = new int[100];
		int m;
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
		a[1] = 2;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 0)
		{
		System.out.print("1");
		System.out.print("\n");
		}
		else
		{
		for (i = 1;i < m;i++)
		{
						 f(a, a);
						 for (j = 0;j < 100;j++)
						 {
							 a[j] = c[j];
						 }
		}
		for (i = 99;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (j = i;j > 0;j--)
		{
			System.out.print(a[j]);
		}
		}
		return 0;
	}
}

