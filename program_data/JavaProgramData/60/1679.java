package <missing>;

public class GlobalMembers
{
	public static int pdss(int a)
	{
		int j;
		int count;
		count = 0;
		for (j = 2;j < a;j++)
		{
			if (a % j == 0)
			{
				count++;
			}
		}
		if (count == 0)
		{
			return 1;
		}
		else if (count > 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int u;
		int v;
		int w;
		int m = 0;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 3;i <= n - 2;i++)
		{
			u = pdss(i);
			if (u == 1)
			{
				v = i + 2;
				w = pdss(v);
				if (w == 1)
				{
					m = 1;

					if (i == 3)
					{
						System.out.printf("%d %d",i,v);
					}
					else if (i != 3)
					{
							System.out.printf("\n%d %d",i,v);
					}
				}
				i = i + 1;
			}

		}
		if (m == 0)
		{
			System.out.print("empty");
		}



		return 0;
	}

}

