package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8]; //s?????? t??????
		int i;
		int j;
		int t;
		int s;
		int I;
		int J;
		int[] m = new int[8];
		int[] n = new int[8];
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			I = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			J = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < I;i++)
		{
			for (j = 0;j < J;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < I;i++)
		{
			n[i] = 0;
			t = a[i][0];
			for (j = 1;j < J;j++)
			{
				if (a[i][j] > t)
				{
					t = a[i][j];
					n[i] = j;
				}
			}
		}
		for (j = 0;j < J;j++)
		{
			m[j] = 0;
			s = a[0][j];
			for (i = 1;i < I;i++)
			{
				if (a[i][j] < s)
				{
					s = a[i][j];
					m[j] = i;
				}
			}
		}
		flag = 1;
		for (i = 0;i < I;i++)
		{
			for (j = 0;j < J;j++)
			{
				if (a[i][n[i]] == a[m[j]][j])
				{
					System.out.printf("%d+%d\n", m[j],n[i]);
					flag = 0;
					break;
				}
			}
		}
		if (flag != 0)
		{
		System.out.print("No\n");
		}
		return 0;
	}
}

