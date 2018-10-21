package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[200][3];
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int s;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if (a[i][1] > a[i][2])
			{
				e = a[i][1];
				a[i][1] = a[i][2];
				a[i][2] = e;
			}
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			if (((a[i][0] % 4 == 0) && (a[i][0] % 100 != 0)) || (a[i][0] % 400 == 0))
			{
				b[1] = 29;
				for (j = a[i][1];j < a[i][2];j++)
				{
					s = s + b[j - 1];
				}
				if (s % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
			else
			{
				b[1] = 28;
				for (j = a[i][1];j < a[i][2];j++)
				{
					s = s + b[j - 1];
				}
				if (s % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
		}
		return 0;

	}
}

