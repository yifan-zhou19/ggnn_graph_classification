package <missing>;

public class GlobalMembers
{
	public static int max(int[] b, int n)
	{
		int i;
		int max3 = b[0];
		int max2 = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max3)
			{
				max3 = b[i];
				max2 = i;
			}
		}
		return (max2);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int sum = 0;
		int[][] a = new int[10][10];
		int k;
		int ap = 0;
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
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;)
		{
			j = max(a[i], n);
			for (k = 0;k < m;k++)
			{
				if (a[k][j] < a[i][j])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto a1;
				}
			}
			System.out.printf("%d+%d",i,j);
			ap++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto a2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a1:
	i++;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a2:
	if (ap == 0)
	{
		   System.out.print("No");
	}
	}
}

