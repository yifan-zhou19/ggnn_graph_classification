public class scholar
{
	public String name = new String(new char[20]);
	public int test;
	public int cm;
	public char leader;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static scholar[] stu = tangible.Arrays.initializeWithDefaultscholarInstances(100);
	public static int Main()
	{
		int i;
		int n;
		int max;
		int s;
		int f;
		int[] money = new int[100];
		i = 0;
		f = 0;
		max = 0;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line could not be converted:
		scanf("%s%d%d%",stu[i].name,&(stu[i].test),&(stu[i].cm));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(stu[i].test) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(stu[i].cm) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(stu[i].leader) = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(stu[i].west) = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(stu[i].paper) = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].test > 80 && stu[i].paper >= 1)
			{
				money[i] = money[i] + 8000;
			}
			if (stu[i].test > 85 && stu[i].cm > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (stu[i].test > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (stu[i].test > 85 && stu[i].west == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (stu[i].cm > 80 && stu[i].leader == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (money[i] > max)
			{
				max = money[i];
				f = i;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			s = s + money[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[f].name,max,s);
		return 0;
	}

}

