public class score
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char ganbu;
	public char xibu;
	public int lunwen;
}

package <missing>;

public class GlobalMembers
{
	public static score[] student = tangible.Arrays.initializeWithDefaultscoreInstances(100);
	public static int Main()
	{
		int i;
		int num;
		int money;
		int max = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].score2 = Integer.parseInt(tempVar4);
			}
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				student[i].ganbu = tempVar5.charAt(0);
			}
			System.in.read();
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				student[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				student[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < num;i++)
		{
			money = 0;
			if (student[i].score1 > 80 && student[i].lunwen > 0)
			{
				money += 8000;
			}
			if (student[i].score1 > 85 && student[i].score2 > 80)
			{
				money += 4000;
			}
			if (student[i].score1 > 90)
			{
				money += 2000;
			}
			if (student[i].score1 > 85 && student[i].xibu == 'Y')
			{
				money += 1000;
			}
			if (student[i].score2 > 80 && student[i].ganbu == 'Y')
			{
				money += 850;
			}
			if (money > max)
			{
				max = money;
			}
			s += money;
		}
		for (i = 0;i < num;i++)
		{
			money = 0;
			if (student[i].score1 > 80 && student[i].lunwen > 0)
			{
				money += 8000;
			}
			if (student[i].score1 > 85 && student[i].score2 > 80)
			{
				money += 4000;
			}
			if (student[i].score1 > 90)
			{
				money += 2000;
			}
			if (student[i].score1 > 85 && student[i].xibu == 'Y')
			{
				money += 1000;
			}
			if (student[i].score2 > 80 && student[i].ganbu == 'Y')
			{
				money += 850;
			}
			if (money == max)
			{
				System.out.printf("%s\n%d\n",student[i].name,max);
				break;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}


}

