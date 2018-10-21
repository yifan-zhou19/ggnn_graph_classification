package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] ys = new int[300];
	int[] sc = new int[300];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ys[i] = Integer.parseInt(tempVar2);
		}
	} //????
	for (i = 0;i < n;i++)
	{
		for (j = 1 + i;j < n;j++)
		{
			if (ys[i] == ys[j])
			{
			ys[j] = 0;
			}
		}
	}
	//??????0
	k = 0;
	for (i = 0;i < n;i++)
	{
		if (ys[i] != 0)
		{
			sc[k] = ys[i];
			k++;
		}

	}
	for (i = 0;i < k;i++)
	{
	if (i != 0)
	{
			System.out.print(",");
	}
		System.out.printf("%d",sc[i]);
	}



	return 0;
	}
}

