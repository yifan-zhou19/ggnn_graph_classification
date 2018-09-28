package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int[] flag = new int[300];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
						p++;
						flag[a[i]]++;
						if (flag[a[i]] == 1 && p == 1)
						{
							System.out.printf("%d",a[i]);
						}
						else if (flag[a[i]] == 1 && p > 1)
						{
							System.out.printf(",%d",a[i]);
						}
						else
						{
						continue;
						}
		}
		return (0);
	}


}

