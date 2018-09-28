package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a >= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int min(int a,int b)
	{
		if (a <= b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int Main()
	{
		int[][] a = new int[100][100];
		int hang;
		int lie;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= hang - 1;i++)
		{
			for (j = 0;j <= lie-1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k <= hang + lie-2;k++)
		{
			   for (i = max(0, k - lie+1);i <= min(hang - 1, k);i++)
			   {
				   System.out.printf("%d\n",a[i][k - i]);
			   }
		}
		return 0;
	}
}

