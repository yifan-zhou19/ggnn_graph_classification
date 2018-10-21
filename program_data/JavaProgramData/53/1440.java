package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int k;
	int i;
	int[] ln = new int[300];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int T;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		ln[i] = Integer.parseInt(tempVar2);
	}
	}
	System.out.printf("%d",ln[0]);
	for (i = 1;i < n;i++)
	{
		T = 1;
		for (k = i - 1;k > 0;k--)
		{
			if ((ln[i] == ln[k]) && (T == 1))
			{
				T = -1;
				break;
			}
		}
		if ((k == 0) && (T != -1) && (ln[i] != ln[0]))
		{
			System.out.printf(",%d",ln[i]);
		}
	}

	return 0;
	}
}

