package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int jiaohuan = new int(int array[][5],int,int);
	int i;
	int j;
	int m;
	int n;
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
	if (jiaohuan(a, m, n) != 0)
	{
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		System.out.printf("%d",a[i][j]);
	if (j != 4)
	{
		System.out.print(" ");
	}
		}
	System.out.print("\n");
		}
	}
	else
	{
	System.out.print("error");
	}
	System.out.print("\n");
	}


	public static int jiaohuan(int[][] array, int m, int n)
	{
		int t;
		int i;
	if ((m > 4) || (n > 4))
	{
		return (0);
	}
	else
	{
		for (i = 0;i < 5;i++)
		{
		t = array[m][i];
	array[m][i] = array[n][i];
	array[n][i] = t;
		}
	return (1);
	}
	}
}

