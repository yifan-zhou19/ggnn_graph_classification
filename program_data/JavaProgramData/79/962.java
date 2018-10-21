package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[300][2];
		int i;
		int j;
		int[] s = new int[300];
		int k = 1;
		int x = 0;
		int p;
		int q;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q = Integer.parseInt(tempVar2);
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				a[i][0] = p;
				a[i][1] = q;
				x = x + 1;
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 2;j <= a[i][0];j++)
			{
				s[i] = (s[i] + a[i][1]) % j;
			}
			System.out.printf("%d\n",s[i] + 1);
		}
	}
}

