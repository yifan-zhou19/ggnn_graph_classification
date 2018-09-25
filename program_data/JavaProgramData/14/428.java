package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[][] a = new int[100000][3];
		int[][] c = new int[100000][3];
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
			 a[i][1] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i][2] = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 a[i][3] = Integer.parseInt(tempVar4);
		 }
		}
		for (i = n - 2;i >= 0;i--)
		{
			if (a[i][2] + a[i][3] < a[i + 1][2] + a[i + 1][3])
			{
			  c[i][1] = a[i][1];
			  c[i][2] = a[i][2];
			  c[i][3] = a[i][3];
		   a[i][1] = a[i + 1][1];
		   a[i][2] = a[i + 1][2];
		   a[i][3] = a[i + 1][3];
		   a[i + 1][1] = c[i][1];
		   a[i + 1][2] = c[i][2];
		   a[i + 1][3] = c[i][3];
			}
		}
		for (i = n - 2;i >= 1;i--)
		{
			if (a[i][2] + a[i][3] < a[i + 1][2] + a[i + 1][3])
			{
			  c[i][1] = a[i][1];
			  c[i][2] = a[i][2];
			  c[i][3] = a[i][3];
		   a[i][1] = a[i + 1][1];
		   a[i][2] = a[i + 1][2];
		   a[i][3] = a[i + 1][3];
		   a[i + 1][1] = c[i][1];
		   a[i + 1][2] = c[i][2];
		   a[i + 1][3] = c[i][3];
			}
		}
		for (i = n - 2;i >= 2;i--)
		{
			if (a[i][2] + a[i][3] < a[i + 1][2] + a[i + 1][3])
			{
			  c[i][1] = a[i][1];
			  c[i][2] = a[i][2];
			  c[i][3] = a[i][3];
		   a[i][1] = a[i + 1][1];
		   a[i][2] = a[i + 1][2];
		   a[i][3] = a[i + 1][3];
		   a[i + 1][1] = c[i][1];
		   a[i + 1][2] = c[i][2];
		   a[i + 1][3] = c[i][3];
			}
		}
		for (k = 0;k < 3;k++)
		{
		   System.out.printf("%d %d\n",a[k][1],a[k][2] + a[k][3]);
		}
		return 0;
	}

}

