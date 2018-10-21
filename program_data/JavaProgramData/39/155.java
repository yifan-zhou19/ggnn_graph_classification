public class stu
{
	public String n = new String(new char[20]);
	public int f;
	public int p;
	public char g;
	public char x;
	public int l;
	public int m;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100);

		int n;
		int i;
		int j;
		int t;
		int sum;
		String c = new String(new char[20]);
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
				a[i].n = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].f = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].p = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].l = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i].m = 0;
		}

		for (i = 0;i < n;i++)
		{
			if (a[i].f > 80 && a[i].l >= 1)
			{
				a[i].m += 8000;
			}
			if (a[i].f > 85 && a[i].p > 80)
			{
				a[i].m += 4000;
			}
			if (a[i].f > 90)
			{
				a[i].m += 2000;
			}
			if (a[i].f > 85 && a[i].x == 'Y')
			{
				a[i].m += 1000;
			}
			if (a[i].p > 80 && a[i].g == 'Y')
			{
				a[i].m += 850;
			}
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += a[i].m;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j].m < a[j + 1].m)
				{
					t = a[j].m;
					a[j].m = a[j + 1].m;
					a[j + 1].m = t;
				 c = a[j].n;
				 a[j].n = a[j + 1].n;
				 a[j + 1].n = c;
				}
			}
		}
			System.out.printf("%s\n",a[0].n);
			System.out.printf("%d\n",a[0].m);
			System.out.printf("%d",sum);
	}

}

