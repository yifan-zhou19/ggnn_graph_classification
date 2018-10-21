package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int m;
		int[] p = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				a = p[m - 1] + m * 3;
				if (a <= 60)
				{
					System.out.printf("%d\n",(60 - a) + p[m - 1]);
				}
				else if (a > 60 && a <= 63)
				{
					System.out.printf("%d\n",p[m - 1]);
				}
				else
				{
					for (i = m - 1;i >= 0;)
					{
						b = p[i] + (i + 1) * 3;
						if (b <= 60)
						{
							System.out.printf("%d\n",(60 - b) + p[i]);
							break;
						}
						else if (b > 60 && b <= 63)
						{
							System.out.printf("%d",p[i]);
							break;
						}
						else
						{
							i--;
						}
					}
				}
			}
		}
		return 0;
	}
}

