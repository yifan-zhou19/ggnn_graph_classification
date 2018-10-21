package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int j = 0;
		if (a == 2)
		{
		return 0;
		}
		else
		{
			for (i = 2;i < a;i++)
			{
							if (a % i == 0)
							{
							break;
							}
							j++;
			}
			if (j == a - 2)
			{
			return 0;
			}
			else
			{
			return 1;
			}
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int[] g = new int[100];
		for (i = 0;i < 100;i++)
		{
						  g[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		j = 0;
		for (b = 2;b <= a;b++)
		{
			if (f(b) == 0)
			{
						g[j] = b;
						j++;
			}
		}
		for (i = 0;i < j;i++)
		{
						c = a - g[i];
						for (k = i;k < j;k++)
						{
							if (c == g[k])
							{
							System.out.printf("%d %d\n",g[i],g[k]);
							}
						}
		}
		System.in.read();
		System.in.read();
	}





}

