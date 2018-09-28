package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
			int i = 0;
			int j;
			for (j = 2;j < x;j++)
			{
					if (x % j == 0)
					{
							i = 1;
					}
			}
			return i;
	}
	public static int Main()
	{
			int n;
			int p;
			int q;
			int i;
			int j;
			int k;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n <= 4)
			{
					System.out.print("empty");
			}
			else if (n <= 6)
			{
					System.out.print("3 5");
			}
			else if (n <= 10)
			{
					System.out.print("3 5\n5 7");
			}
			else
			{
					System.out.print("3 5\n5 7\n");
					for (i = 11,k = 13;k <= n;i = i + 2,k = k + 2)
					{

							p = judge(i);
							q = judge(k);
							if ((q == 0) && (p == 0))
							{
									System.out.printf("%d %d\n",i,k);
							}
					}
			}

			return 0;

	}
}

