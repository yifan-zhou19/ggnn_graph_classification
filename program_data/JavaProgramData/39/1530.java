public class Scholarship
{
	public String name = new String(new char[20]);
	public int final;
	public int classmate;
	public char leader;
	public char westerner;
	public int paper;
	public double sum;
}

package <missing>;

public class GlobalMembers
{
	public static Scholarship[] a = tangible.Arrays.initializeWithDefaultScholarshipInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		double max = 0;
		double total = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].classmate = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].westerner = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i].sum = 0;
			if (a[i].final > 80 && a[i].paper >= 1)
			{
				a[i].sum = a[i].sum + 8000;
			}
			if (a[i].final > 85 && a[i].classmate > 80)
			{
				a[i].sum = a[i].sum + 4000;
			}
			if (a[i].final > 90)
			{
				a[i].sum = a[i].sum + 2000;
			}
			if (a[i].final > 85 && a[i].westerner == 'Y')
			{
				a[i].sum = a[i].sum + 1000;
			}
			if (a[i].classmate > 80 && a[i].leader == 'Y')
			{
				a[i].sum = a[i].sum + 850;
			}
			total = total + a[i].sum;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].sum > max)
			{
				max = a[i].sum;
				count = i;
			}
		}
		System.out.printf("%s\n",a[count].name);
		System.out.printf("%.0lf\n",a[count].sum);
		System.out.printf("%.lf\n",total);
		return 0;
	}
}

