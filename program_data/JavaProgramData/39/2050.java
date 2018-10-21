public class jiangli
{
	public String name = new String(new char[20]);
	public int study;
	public int cla;
	public char gugan;
	public char xibu;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static jiangli[] stu = tangible.Arrays.initializeWithDefaultjiangliInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int max;
		int sum = 0;
		int k;
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
				stu[i].study = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gugan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			if (stu[i].study > 80 && stu[i].paper >= 1)
			{
				stu[i].money += 8000;
			}
			if (stu[i].study > 85 && stu[i].cla > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].study > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].study > 85 && stu[i].xibu == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].cla > 80 && stu[i].gugan == 'Y')
			{
				stu[i].money += 850;
			}
		}
		max = stu[0].money;
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
			if (max < stu[i].money)
			{
				max = stu[i].money;
				k = i;
			}
		}
			System.out.printf("%s\n%d\n%d",stu[k].name,stu[k].money,sum);
	}
}

