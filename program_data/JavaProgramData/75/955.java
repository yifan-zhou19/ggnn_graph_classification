package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int[][] a = new int[1000][2];
		int[] b = new int[1002];
		int l;
		int m = 0;
		int n = 0;
		int max = 0;
		char[][] c = new char[2][5000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c[0] = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c[1] = tempVar2.charAt(0);
		}
		a[0][0] = 0;
		a[0][1] = 0;
		for (i = 0;i < String.valueOf(c[0]).length();i++)
		{

			if (c[0][i] == ',')
			{
				m++;
				a[m][0] = 0;
			}
			else
			{
				a[m][0] = a[m][0] * 10 + (c[0][i] - 48);
			}
		}
			  for (i = 0;i < String.valueOf(c[1]).length();i++)
			  {
					   if (c[1][i] == ',')
					   {
				n++;
				a[n][1] = 0;
					   }
			else
			{
				a[n][1] = a[n][1] * 10 + (c[1][i] - 48);
			}
			  }
		System.out.printf("%d ",m + 1);
		for (i = 0;i <= m;i++)
		{
			for (j = a[i][0];j < a[i][1];j++)
			{
				b[j]++;
			}
		}
		for (i = 0;i < 1001;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
	}

}

