public class student
{
	public String name = new String(new char[25]);
	public int qimo;
	public int banji;
	public String ganbu = new String(new char[2]);
	public String xibu = new String(new char[2]);
	public int lunwen;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	public static student temp = new student();
	public static void Main()
	{
		int i;
		int j;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lunwen = Integer.parseInt(tempVar7);
			}
			if (stu[i].qimo > 80 && stu[i].lunwen >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].qimo > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu.charAt(0) == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].banji > 80 && stu[i].ganbu.charAt(0) == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (stu[j].money < stu[j + 1].money)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[j];
					temp.copyFrom(stu[j]);
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[0].name,stu[0].money,sum);
	}

}

