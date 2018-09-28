public class bac
	{
	public String name = new String(new char[20]);
	public int num1;
	public int num2;
	public char ganbu;
	public char west;
	public char paper;
	public int money;
	}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		bac[] stu = tangible.Arrays.initializeWithDefaultbacInstances(101);
		bac temp = new bac();
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
			stu[i].money = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].num1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].num2 = Integer.parseInt(tempVar4);
			}
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			System.in.read();
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			System.in.read();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].num1 > 80 && stu[i].paper >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].num1 > 85 && stu[i].num2 > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].num1 > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].num1 > 85 && stu[i].west == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].num2 > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
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
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		System.out.printf("%s\n%d\n",stu[0].name,stu[0].money);
		System.out.printf("%d",sum);
		return 0;
	}


}

