package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] d = new int[8][8];
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		int[] max = new int[8];
		int[] min = new int[8];
		int[] hang = new int[8];
		int[] lie = new int[8];
		int o = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
	for (j = 0;j < b;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 0;i < a;i++)
	{
		max[i] = d[i][0];
		lie[i] = 0;
	for (j = 1;j < b;j++)
	{
	if (d[i][j] > max[i])
	{
		max[i] = d[i][j];
		lie[i] = j;
	}
	}
	}
	for (j = 0;j < b;j++)
	{
		min[j] = d[0][j];
		hang[j] = 0;
	for (i = 1;i < a;i++)
	{
	if (d[i][j] < min[j])
	{
		min[j] = d[i][j];
		hang[j] = i;
	}
	}
	}
	for (i = 0;i < a;i++)
	{
		if (i == hang[lie[i]])
		{
		System.out.printf("%d+%d\n",i,lie[i]);
	o++;
		}
	}
	if (o == 0)
	{
		System.out.print("No\n");
	}
	}


}

