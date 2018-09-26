package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int c;
		int[][] a = new int[5][5];
		int temp;
		int compare = new int(int n,int m);
		int[] p = new int[5];
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		c = compare(n, m);
		if (c != 0)
		{
			for (j = 0;j < 5;j++)
			{
				temp = (p[n] + j);
				*(p[n] + j) = *(p[m] + j);
				*(p[m] + j) = temp;
			}
			p = a;
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",*(p[i] + j));
				}
				System.out.printf("%d\n",*(p[i] + j));
			}
		}
		else
		{
			System.out.print("error");
		}
	}
	public static int compare(int n,int m)
	{
		int c;
		if (n < 5 && m < 5)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return (c);
	}






}

