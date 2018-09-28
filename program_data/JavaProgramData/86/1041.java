package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int u;
		int num;
		int n;
		int[] a = new int[100];
		int[][] b = new int[100][100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			num = a[i] * 3;
			for (u = 0;u < a[i];u++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][u] = Integer.parseInt(tempVar3);
				}
				if (u * 3 + b[i][u] > 59)
				{
					num -= 3;
				}
				if (u * 3 + b[i][u] == 59)
				{
					num -= 2;
				}
				if (u * 3 + b[i][u] == 58)
				{
					num -= 1;
				}
			}
			System.out.printf("%d\n",60 - num);
		}
		return 0;
	}
}

