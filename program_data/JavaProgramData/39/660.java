public class stu
{
	public String name = new String(new char[20]);
	public int final;
	public int cla;
	public String ban = new String(new char[2]);
	public String xi = new String(new char[2]);
	public int pap;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100);

	public static int Main()
	{
		int n;
		int i;
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
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i].ban = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].pap = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i].sum = 0;
			if (a[i].final > 80 && a[i].pap >= 1)
			{
				a[i].sum = a[i].sum + 8000;
			}
			if (a[i].final > 85 && a[i].cla > 80)
			{
				a[i].sum = a[i].sum + 4000;
			}
			if (a[i].final > 90)
			{
				a[i].sum = a[i].sum + 2000;
			}
			if (a[i].final > 85 && a[i].xi.charAt(0) == 'Y')
			{
				a[i].sum = a[i].sum + 1000;
			}
			if (a[i].cla > 80 && a[i].ban.charAt(0) == 'Y')
			{
				a[i].sum = a[i].sum + 850;
			}
		}
		int max = a[0].sum;
		int t = 0;
		int zong = 0;
		for (i = 0;i < n;i++)
		{
			if (max < a[i].sum)
			{
				max = a[i].sum;
				t = i;
			}
			zong = zong + a[i].sum;
		}
		System.out.printf("%s\n%d\n%d\n",a[t].name,a[t].sum,zong);
		return 0;
	}

}

