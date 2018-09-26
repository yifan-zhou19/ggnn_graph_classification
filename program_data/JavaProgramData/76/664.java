public class qj
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	qj[] jg = tangible.Arrays.initializeWithDefaultqjInstances(50000);
	int n;
	int i;
	int m;
	double j;
	int[] sz1 = new int[50000];
	int[] sz2 = new int[50000];
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
			jg[i].a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jg[i].b = Integer.parseInt(tempVar3);
		}
		sz1[i] = jg[i].a;
		sz2[i] = jg[i].b;
	}
	for (i = 0;i < n;i++)
	{
		if (sz1[0] > sz1[i])
		{
			sz1[0] = sz1[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (sz2[0] < sz2[i])
		{
			sz2[0] = sz2[i];
		}
	}
	for (j = sz1[0];j < sz2[0];j += 0.5)
	{
		for (i = 0;i < n;i++)
		{
			if (j >= jg[i].a != 0 && j <= jg[i].b)
			{
				m = 0;
				break;
			}
			else
			{
				m = 1;
			}
		}
		if (m == 1)
		{
			System.out.print("no");
			break;
		}
	}
	if (m == 0)
	{
		System.out.printf("%d %d",sz1[0],sz2[0]);
	}
	return 0;
	}

}

