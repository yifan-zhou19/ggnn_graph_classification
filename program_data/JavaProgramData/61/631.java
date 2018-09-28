package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int t;
		int[] p = new int[1000];
		int s;
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
				p[i] = Integer.parseInt(tempVar2);
			}
		}
	for (i = 0;i < n;i++)
	{
			if (p[i] == 1 || p[i] == 2)
			{
					System.out.print("1\n");
			}
				else
				{
					s = 0;
					a = 1;
					b = 1;
					for (j = 1;j <= p[i] - 2;j++)
					{
					s = a + b;
				t = b;
				b = s;
				a = t;


					}

			System.out.printf("%d\n",s);
				}


	}
	return 0;
	}
}

