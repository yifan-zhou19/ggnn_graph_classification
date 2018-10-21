public class person
{
	public String n = new String(new char[20]);
	public int q;
	public int p;
	public char g;
	public char x;
	public int lun;
}

package <missing>;

public class GlobalMembers
{
	public static int jiang(person a)
	{
		int j = 0;
		if (a.q > 80 && a.lun > 0)
		{
			j = j + 8000;
		}
		if (a.q > 85 && a.p > 80)
		{
			j = j + 4000;
		}
		if (a.q > 90)
		{
			j = j + 2000;
		}
		if (a.q > 85 && a.x == 'Y')
		{
			j = j + 1000;
		}
		if (a.p > 80 && a.g == 'Y')
		{
			j = j + 850;
		}
		return (j);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int r;
		double sum = 0;
		int[] a = new int[100];
		person[] p = tangible.Arrays.initializeWithDefaultpersonInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].n = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].q = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i].p = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p[i].lun = Integer.parseInt(tempVar7);
			}
			a[i] = jiang(p[i]);
			sum = sum + a[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			r = 0;
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j] > a[i])
				{
					r = 1;
				}
			}
			if (r == 0)
			{
				System.out.printf("%s\n%d\n%.0lf",p[i].n,a[i],sum);
				break;
			}
		}
	}
}

