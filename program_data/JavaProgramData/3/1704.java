package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1000];
		int[][] b = new int[1000][1000];
	int m;
	m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < k;i++)
	{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[i] = Integer.parseInt(tempVar3);
						}
	}
	for (i = 0;i < k;i++)
	{
	for (j = k;j > i;j--)
	{
					 if ((a[i] - a[j]) == k)
					 {
					 System.out.print("yes");
					 m = 1;
					 return 0;
					 }

	}
	}
	if (m == 0)
	{
		System.out.print("no");
	}

	return 0;
	}

}

