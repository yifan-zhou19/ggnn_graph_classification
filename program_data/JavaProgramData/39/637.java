public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banji;
	public char leader;
	public char west;
	public int essay;
}
public class money
{
	public int p;
	public int q;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
	public static money[] money = tangible.Arrays.initializeWithDefaultmoneyInstances(1000);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] max = new int[1000];
		int mmax;
		int k = 0;
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
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].essay = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			money[i].p = 0;
		money[i].q = i;
			if (stu[i].qimo > 80 && stu[i].essay >= 1)
			{
				money[i].p = money[i].p + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				money[i].p = money[i].p + 4000;
			}
			if (stu[i].qimo > 90)
			{
				money[i].p = money[i].p + 2000;
			}
		if (stu[i].qimo > 85 && stu[i].west == 'Y')
		{
				money[i].p = money[i].p + 1000;
		}
			if (stu[i].banji > 80 && stu[i].leader == 'Y')
			{
				money[i].p = money[i].p + 850;
			}
		}
		j = i;
		mmax = money[0].p;
		for (i = 0;i < j;i++)
		{
			if (mmax < money[i].p)
			{
				mmax = money[i].p;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (mmax == money[i].p)
			{
				k = money[i].q;
				break;
			}
		}

			for (i = 0;i < n;i++)
			{
				sum = sum + money[i].p;
			}
			System.out.printf("%s\n%ld\n%ld",stu[k].name,money[k].p,sum);
	}
}

