package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[1000][1000];
		int b;
		int start1;
		int start2;
		int end1;
		int end2;
		b = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0 && b == 0)
				{
					start1 = i + 1;
					start2 = j + 1;
					b = 1;
				}
				if (a[i][j] == 0 && b == 1)
				{
					end1 = i + 1;
					end2 = j + 1;
				}
			}
		}
		int area;
		area = (end1 - start1 - 1) * (end2 - start2 - 1);
		System.out.printf("%d",area);
		return 0;
	}


}

