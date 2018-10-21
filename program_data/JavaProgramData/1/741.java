package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int i);
		int n;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			b = f(a, 2);
		System.out.printf("%d\n",b);
		}
	}
	public static int f(int m,int i)
	{
		int s;
		int j;
		if (m < i)
		{
			s = 0;
		}
		else
		{
				if (m < i * i)
				{
					s = 1;
				}
			else
			{
					for (s = 1,j = i;j <= m;j++)
					{
						if (m % j == 0)
						{
						s = s + f(m / j, j);
						}
					}
			}
		}
		return (s);
	}
}

