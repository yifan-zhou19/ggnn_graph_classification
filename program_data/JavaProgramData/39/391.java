public class student
{
	public String name = new String(new char[200]);
	public int score1;
	public int score2;
	public char c1;
	public char c2;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int N;
		int i;
		int maxmoney = 0;
		int maxnum = 0;
		int summoney = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].score2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].c1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].c2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = Integer.parseInt(tempVar7);
			}
			if (a[i].score1 > 80 && a[i].paper > 0)
			{
				a[i].money += 8000;
			}
			if (a[i].score1 > 85 && a[i].score2 > 80)
			{
				a[i].money += 4000;
			}
			if (a[i].score1 > 90)
			{
				a[i].money += 2000;
			}
			if (a[i].score1 > 85 && a[i].c2 == 'Y')
			{
				a[i].money += 1000;
			}
			if (a[i].score2 > 80 && a[i].c1 == 'Y')
			{
				a[i].money += 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i].money > maxmoney)
			{
				maxmoney = a[i].money;
				maxnum = i;
			}
			summoney += a[i].money;
		}
		System.out.printf("%s\n%d\n%d",a[maxnum].name,maxmoney,summoney);
	}




}

