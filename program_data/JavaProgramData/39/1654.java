public class student
{
	public String name = new String(new char[30]);
	public int sco;
	public int pin;
	public char gan;
	public char xi;
	public int lun;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[100];
		int sum = 0;
		int t;
		int add = 0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].sco = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].pin = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lun = Integer.parseInt(tempVar7);
			}
			a[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			if (stu[i].sco > 80 && stu[i].lun >= 1)
			{
				a[i] = a[i] + 8000;
			}
			if (stu[i].sco > 85 && stu[i].pin > 80)
			{
				a[i] = a[i] + 4000;
			}
			if (stu[i].sco > 90)
			{
				a[i] = a[i] + 2000;
			}
			if (stu[i].sco > 85 && stu[i].xi == 'Y')
			{
				a[i] = a[i] + 1000;
			}
			if (stu[i].pin > 80 && stu[i].gan == 'Y')
			{
				a[i] = a[i] + 850;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (sum < a[i])
			{
				sum = a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == sum)
			{
				t = i;
				break;
			}

		}
		for (i = 1;i <= n;i++)
		{
			add = add + a[i];
		}

		System.out.printf("%s\n%d\n%d",stu[t].name,sum,add);

	}
}

