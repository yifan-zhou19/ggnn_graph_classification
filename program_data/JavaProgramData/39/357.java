public class money
{
	public String name = new String(new char[20]);
	public int qm;
	public int bj;
	public char gb;
	public char xb;
	public int lw;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		money[] stu = tangible.Arrays.initializeWithDefaultmoneyInstances(100);
		int n;
		int i;
		int p;
		int[] a = new int[100];
		int max = 0;
		int sum = 0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qm = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].bj = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = Integer.parseInt(tempVar7);
			}
			if (stu[i].qm > 80 && stu[i].lw >= 1)
			{
				a[i] = a[i] + 8000;
			}
			if (stu[i].qm > 85 && stu[i].bj > 80)
			{
				a[i] = a[i] + 4000;
			}
			if (stu[i].qm > 90)
			{
				a[i] = a[i] + 2000;
			}
			if (stu[i].qm > 85 && stu[i].xb == 'Y')
			{
				a[i] = a[i] + 1000;
			}
			if (stu[i].bj > 80 && stu[i].gb == 'Y')
			{
				a[i] = a[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max == a[i])
			{
				p = i;
				break;
			}
		}
		System.out.printf("%s\n%ld\n%ld",stu[p].name,a[p],sum);
	}
}

