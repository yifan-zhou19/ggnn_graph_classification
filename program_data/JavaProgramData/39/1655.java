public class student
{
	public String num = new String(new char[100]);
	public int sco;
	public int pin;
	public char gan;
	public char xi;
	public int pap;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[100];
		int sum = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2.charAt(0);
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
				stu[i].pap = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sco > 80 && stu[i].pap >= 1)
			{
				a[i] += 8000;
			}
			if (stu[i].sco > 85 && stu[i].pin > 80)
			{
				a[i] += 4000;
			}
			if (stu[i].sco > 90)
			{
				a[i] += 2000;
			}
			if (stu[i].sco > 85 && stu[i].xi == 'Y')
			{
				a[i] += 1000;
			}
			if (stu[i].pin > 80 && stu[i].gan == 'Y')
			{
				a[i] += 850;
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				break;
			}
		}
			System.out.printf("%s\n%d",stu[i].num,a[i]);
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		System.out.printf("\n%d",sum);



	}
}

