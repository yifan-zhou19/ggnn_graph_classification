package <missing>;

public class GlobalMembers
{
	public static int judge(int a,int b)
	{
	int l = 0;
	if (a < 0 || a>4 || b < 0 || b>4)
	{
	l = 1;
	}
	return l;
	}
	public static void Main()
	{
	int m;
	int n;
	int k;
	int i;
	int j;
	int t;
	int[][] a = new int[5][5];

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
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}



	k = judge(m, n);
	if (k == 1)
	{
	System.out.print("error");
	}
	else
	{
		for (i = 0;i < 5;i++)
		{
			t = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = t;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d",a[i][4]);
			System.out.print("\n");
		}
	}



	}
}

