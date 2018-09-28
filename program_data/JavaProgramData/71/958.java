package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				m[2] = 29;
			}
			else
			{
				m[2] = 28;
			}

			if (b > c)
			{
				int j;
				int s = 0;
				for (j = c;j < b;j++)
				{
					s = s + m[j];

				}
				if (s % 7 == 0)
				{
						System.out.print("YES\n");
				}
					else
					{
						System.out.print("NO\n");
					}
			}
			if (c > b)
			{
				int j;
				int s = 0;
				for (j = b;j < c;j++)
				{
					s = s + m[j];

				}
				if (s % 7 == 0)
				{
						System.out.print("YES\n");
				}
					else
					{
						System.out.print("NO\n");
					}
			}
		}
	}


}

