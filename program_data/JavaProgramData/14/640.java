public class stu
{
	public int num;
	public int chi;
	public int mat;
	public int tot;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100050);
		int n;
		int k;
		int i;
		int j;
		int temp2;
		int max;
		int temp1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].mat = Integer.parseInt(tempVar4);
			}
			a[i].tot = a[i].chi + a[i].mat;
		}
		for (j = 1;j <= 3;j++)
		{
		max = 0;
		a[0].tot = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[max].tot < a[i].tot)
			{
				max = i;
			}
		}
		System.out.printf("%ld %d\n",a[max].num,a[max].tot);
		a[max].tot = 0;
		}
		scanf("\n");
		return (0);
	}
}

