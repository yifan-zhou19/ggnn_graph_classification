package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[21];
	int m;
	int p;
	a[0] = 0;
	a[1] = 1;
	for (int i = 2;i < 21;i++)
	{
			a[i] = a[i - 1] + a[i - 2];
	}
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int j = 0;j < n;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",a[p]);
	}
			int hou;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hou = Integer.parseInt(tempVar3);
			}
	return 0;
	}

}

