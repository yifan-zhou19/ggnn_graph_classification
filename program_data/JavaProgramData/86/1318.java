package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int c;
		int d;
		int e;
		int f;
		int a;
		int b;
		int[] g = new int[60];
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
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				a = b = 0;
			   // memset(g,0,sizeof(g));
				for (k = 0;k < 60;k++)
				{
					g[k] = 0;
				}
				for (k = 0;k < m;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						g[k] = Integer.parseInt(tempVar3);
					}
				}
				k = 0;
				for (;b < 60;)
				{
					a++;
					b++;
					if (a == g[k])
					{
						b += 3;
						k++;
					}

				}
				System.out.printf("%d\n",a);
			}
		}
		return 0;
	}

}

