package <missing>;

public class GlobalMembers
{
	public static int Array(int[][] a, int i, int j)
	{
		int k;
		int t;
		if (i < 5 && j < 5)
		{
			for (k = 0;k < 5;k++)
			{
				t = a[i][k];
				a[i][k] = a[j][k];
				a[j][k] = t;
			}
		return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()


	{
		int[][] s = new int[5][5];
		int n;
		int m;
		int p;
		int q;
		for (p = 0;p < 5;p++)
		{
			for (q = 0;q < 5;q++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[p][q] = Integer.parseInt(tempVar);
			}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}

		if (Array(s, n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (p = 0;p < 5;p++)

			{
				for (q = 0;q < 5;q++)
				{
					if (q < 4)
					{
					System.out.printf("%d ",s[p][q]);
					}
				else
				{
					System.out.printf("%d\n",s[p][q]);
				}
				}
			}
		}
	}






}

