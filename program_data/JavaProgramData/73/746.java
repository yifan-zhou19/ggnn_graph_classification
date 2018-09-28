package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[][] a = new int[5][3];
		int[][] s = new int[5][5];
		int[] r = new int[5];
		int[] c = new int[5];
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i][j] = Integer.parseInt(tempVar);
			}
		if (s[i][j] > r[i])
		{
			r[i] = s[i][j];
		}
		if (s[i][j] < c[j] || c[j] == 0)
		{
			c[j] = s[i][j];
		}
		}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		if (s[i][j] == r[i] && s[i][j] == c[j])
		{
			a[k][0] = i + 1;
			a[k][1] = j + 1;
			a[k][2] = s[i][j];
		}
		}
		}
		k = 0;
		//for(k=0;a[k][0]!=0;k++)
		if (a[k][0] == 0)
		{
			System.out.print("not found");
		}
		else
		{
		System.out.printf("%d %d %d",a[k][0],a[k][1],a[k][2]);
		}
		return 0;
	}


}

