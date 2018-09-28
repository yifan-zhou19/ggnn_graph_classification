package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int b;
		int k;
		int tf = 1;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			k = a[i][0];
			b = 0;
			for (j = 0;j < n;j++)
			{
				if (k < a[i][j])
				{
					k = a[i][j];
					b = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (k > a[j][b])
				{
					tf = 0;
				}
			}
			if (tf == 1)
			{
				z = 1;
				System.out.printf("%d+%d\n",i,b);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		if (z == 0)
		{
				 System.out.print("No\n");
		}
		return 0;
	}
}

