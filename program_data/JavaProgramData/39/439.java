public class student
{
	public String name = new String(new char[21]);
	public short finalscore;
	public short clascore;
	public char position;
	public char westen;
	public short essaynum;
	public int reward;

}

package <missing>;

public class GlobalMembers
{
	public static student ;
	public static int Main()
	{
		int nstu = 4;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nstu = Integer.parseInt(tempVar);
		}
		student[] p = tangible.Arrays.initializeWithDefaultstudentInstances(nstu);
		int i;
		for (i = 0;i < nstu;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p[i].finalscore) = Short.parseShort(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p[i].clascore) = Short.parseShort(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				p[i].position = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				p[i].westen = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				(p[i].essaynum) = Short.parseShort(tempVar7);
			}
			p[i].reward = 0;
		}
		for (i = 0;i < nstu;i++)
		{
			if (p[i].finalscore > 80 && p[i].essaynum > 0)
			{
				(p[i].reward) += 8000;
			}
			if (p[i].finalscore > 85 && p[i].clascore > 80)
			{
				(p[i].reward) += 4000;
			}
			if (p[i].finalscore > 90)
			{
				(p[i].reward) += 2000;
			}
			if (p[i].westen == 'Y' && p[i].finalscore > 85)
			{
				(p[i].reward) += 1000;
			}
			if (p[i].position == 'Y' && p[i].clascore > 80)
			{
				(p[i].reward) += 850;
			}
		}
		int money = p[0].reward;
		for (i = 0;i < nstu - 1;i++)
		{
			if (money < p[i + 1].reward)
			{
				money = (p[i + 1].reward);
			}
			total += (p[i].reward);
		}
		total += (p[nstu - 1].reward);
		int j;
		for (j = 0;j < nstu;j++)
		{
			if (p[j].reward == money)
			{
				break;
			}
		}
		System.out.printf("%s\n",p[j].name);
		System.out.printf("%d\n",p[j].reward);
		System.out.printf("%d\n",total);
		return 0;
	}



}

