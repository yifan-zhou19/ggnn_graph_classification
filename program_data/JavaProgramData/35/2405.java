package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[max][max];
		int j;
		int i;
		int k;
		int s;
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
		for (j = 0;j < m;j++)
		{
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j][i] = Integer.parseInt(tempVar3);
					}
				}
		}
		for (j = 0;j < m;j++)
		{
				for (i = 0;i < n;i++)
				{
						for (k = 0;k < n;k++)
						{
								if (a[j][i] < a[j][k])
								{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto l;
								}
						}
						for (s = 0;s < m;s++)
						{
								if (a[j][i] > a[s][i])
								{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
										goto l;
								}
						}
						System.out.printf("%d+%d",j,i);
						return 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						l:
						;
				}
		}
		System.out.print("No");
		return 0;
	}

}

