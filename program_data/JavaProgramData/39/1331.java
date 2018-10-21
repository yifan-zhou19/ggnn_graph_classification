public class std
{
	public String name = new String(new char[20]);
	public int qi;
	public int ban;
	public char xue;
	public char xi;
	public int lun;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = struct std x;
		int n;
		int i;
		int[] a;
		int max;
		int sum = 0;
		std[] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		p = tangible.Arrays.initializeWithDefaultstdInstances(n);
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].qi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].ban = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].xue = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p[i].lun = Integer.parseInt(tempVar7);
			}
			a[i] = panduan(p[i]);
		}
		for (i = 0,max = 0;i <= n - 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			sum = sum + a[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%s\n%d\n",p[i].name,max);
				break;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
	public static int panduan(std x)
	{
		int sum = 0;
		if (x.qi > 80 && x.lun >= 1)
		{
			sum = sum + 8000;
		}
		if (x.qi > 85 && x.ban > 80)
		{
			sum = sum + 4000;
		}
		if (x.qi > 90)
		{
			sum = sum + 2000;
		}
		if (x.xi == 'Y' && x.qi > 85)
		{
			sum = sum + 1000;
		}
		if (x.ban > 80 && x.xue == 'Y')
		{
			sum = sum + 850;
		}
		return sum;
	}

}

