package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[10][10];
		int max;
		int s = 0;
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
		for (i = 0;i < m;)
		{
			max = 0;
			for (j = 0;j < n;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					k = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][k] < a[i][k])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto a1;
				}
			}
			System.out.printf("%d+%d",i,k);
			s = 1;
			break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a1:
	i++;
		}
		if (s == 0)
		{
			System.out.print("No");
		}
	}
}

