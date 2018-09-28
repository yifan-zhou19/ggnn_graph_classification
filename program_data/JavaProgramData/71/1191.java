package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
				if (b > c)
				{
					int x;
					x = b;
					b = c;
					c = x;
				}
				if (a % 400 == 0)
				{
					m = 0;
				}
				else if (a % 100 == 0 && a % 400 != 0)
				{
					m = 1;
				}
				else if (a % 100 != 0 && a % 4 == 0)
				{
					m = 0;
				}
				else if (a % 4 != 0)
				{
					m = 1;
				}
				int d = 0;
				if (m == 0)
				{
					int[] f = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					for (j = (b - 1);j < (c - 1);j++)
					{
						d += f[j];
					}

				}

				else if (m == 1)
				{
					int[] f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					for (j = (b - 1);j < (c - 1);j++)
					{
						d += f[j];
					}
				}
				if (d % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else if (d % 7 != 0)
				{
					System.out.print("NO\n");
				}
		}



	}

}

