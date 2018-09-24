package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int[] a = new int[100];
	int i;
	int j;
	int num = 0;
	int total = 0;
	while (true)
	{
		num = 0;
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[num] = Integer.parseInt(tempVar);
	}
	if (a[num] == 0)
	{
		break;
	}
	if (a[num] == -1)
	{
	num++;
	}
	}

	total = 0;
	for (i = 0;i < num;i++)
	{

	for (j = 0;j < num;j++)
	{
	if (a[j] == 2 * a[i])
	{
		total++;
	}
	}
	}
	System.out.printf("%d\n",total);
	}
	}


}

