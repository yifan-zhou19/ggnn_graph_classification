package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[8][8];
	int hang;
	int lie;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		hang = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		lie = Integer.parseInt(tempVar2);
	}
	int i;
	int k;
	int temp_max = 0;
	int temp_min = 0;
	int temp_min2 = 0;
	int pianduan = 0;
	for (i = 0;i < hang;i++)
	{
	for (k = 0;k < lie;k++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i][k] = Integer.parseInt(tempVar3);
	}
	}
	}

	for (i = 0;i < hang;i++)
	{
	for (k = 0;k < lie;k++)
	{
	if (sz[i][k] > sz[i][temp_max])
	{
	temp_max = k;
	temp_min = i;
	}
	}


	for (i = 0;i < hang;i++)
	{
	if (sz[i][temp_max] < sz[temp_min2][temp_max])
	{
	temp_min2 = i;
	}
	}
	if (temp_min2 == temp_min)
	{
	System.out.printf("%d+%d",temp_min,temp_max);
	pianduan = 1;
	}
	}

	if (pianduan == 0)
	{
		System.out.print("No");
	}

	return 0;
	}
}

