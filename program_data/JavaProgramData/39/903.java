public class stu
{
	public String name = new String(new char[25]);
	public int sco;
	public int scob;
	public int gb;
	public int xb;
	public int lw;
	public int mon;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int zh;
		int all = 0;
		char du1;
		char du2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].sco = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].scob = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				du1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				du2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].lw = Integer.parseInt(tempVar7);
			}
			if (du1 == 'Y')
			{
				a[i].gb = 1;
			}
			else
			{
				a[i].gb = 0;
			}
			if (du2 == 'Y')
			{
				a[i].xb = 1;
			}
			else
			{
				a[i].xb = 0;
			}
			a[i].mon = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].sco > 80 && a[i].lw >= 1)
			{
				a[i].mon += 8000;
			}
			if (a[i].sco > 85 && a[i].scob > 80)
			{
				a[i].mon += 4000;
			}
			if (a[i].sco > 90)
			{
				a[i].mon += 2000;
			}
			if (a[i].sco > 85 && a[i].xb == 1)
			{
				a[i].mon += 1000;
			}
			if (a[i].scob > 80 && a[i].gb == 1)
			{
				a[i].mon += 850;
			}
			if (a[i].mon > max)
			{
				max = a[i].mon;
				zh = i;
			}
			all += a[i].mon;
		}
		System.out.printf("%s\n%d\n%lu",a[zh].name,a[zh].mon,all);
	}
}

