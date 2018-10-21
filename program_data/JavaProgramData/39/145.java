public class stu
{
	public String name = new String(new char[20]);
	public int aver;
	public int sugg;
	public char ganbu;
	public char xibu;
	public int amount;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);
	public static int Main()
	{
		int k = 0;
		int j;
		int N;
		int M = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (k = 0;k < N;k++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  stu[k].name = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  stu[k].aver = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  stu[k].sugg = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  stu[k].ganbu = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  stu[k].xibu = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  stu[k].amount = Integer.parseInt(tempVar7);
		  }
		}
		for (k = 0;k < N;k++)
		{
			stu[k].money = 0;
			if (stu[k].aver > 80 && stu[k].amount >= 1)
			{
				stu[k].money += 8000;
			}
			if (stu[k].aver > 85 && stu[k].sugg > 80)
			{
				stu[k].money += 4000;
			}
			if (stu[k].aver > 90)
			{
				stu[k].money += 2000;
			}
			if (stu[k].aver > 85 && stu[k].xibu == 'Y')
			{
				stu[k].money += 1000;
			}
			if (stu[k].sugg > 80 && stu[k].ganbu == 'Y')
			{
				stu[k].money += 850;
			}
		}
		for (j = 1;j < N;j++)
		{
			if (stu[j].money > stu[k].money)
			{
				k = j;
			}
		}
			System.out.printf("%s\n",stu[k].name);
			System.out.printf("%d\n",stu[k].money);
			for (j = 0;j < N;j++)
			{
				M += stu[j].money;
			}
			System.out.printf("%d\n",M);
	}
}

