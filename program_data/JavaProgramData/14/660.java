public class stu
{
	public int num;
	public int yu;
	public int shu;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(4);
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
				a[0].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0].yu = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[0].shu = Integer.parseInt(tempVar4);
			}
			a[0].sum = a[0].yu + a[0].shu;
			if (a[0].sum > a[1].sum)
			{
				a[3].sum = a[2].sum;
				a[3].num = a[2].num;
				a[2].sum = a[1].sum;
				a[2].num = a[1].num;
				a[1].sum = a[0].sum;
				a[1].num = a[0].num;
			}
			else
			{
				if (a[0].sum > a[2].sum)
				{
					a[3].sum = a[2].sum;
					a[3].num = a[2].num;
					a[2].sum = a[0].sum;
					a[2].num = a[0].num;
				}
				else if (a[0].sum > a[3].sum)
				{
					a[3].sum = a[0].sum;
					a[3].num = a[0].num;
				}
			}
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.printf("%d %d\n",a[i].num,a[i].sum);
		}
	}
}

