public class student
{
	public String name = new String(new char[20]);
	public int score;
	public int judge;
	public char c1;
	public char c2;
	public char num;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(501);
		String s1 = new String(new char[20]);
		int i;
		int n;
		int max = 0;
		int sum = 0;
		int score1;
		int num1;
		int judge1;
		char c11;
		char c12;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			p.name = s1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				judge1 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c11 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c12 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				num1 = Integer.parseInt(tempVar7);
			}
			p.c1 = c11;
			p.c2 = c12;
			p.judge = judge1;
			p.num = num1;
			p.score = score1;
			p.money = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		for (;p < a + n;p++)
		{
			if (p.score > 80 && p.num > 0)
			{
				p.money += 8000;
			}
			if (p.judge > 80 && p.score > 85)
			{
				p.money += 4000;
			}
			if (p.score > 90)
			{
				p.money += 2000;
			}
			if (p.c1 == 'Y' && p.judge > 80)
			{
				p.money += 850;
			}
			if (p.c2 == 'Y' && p.score > 85)
			{
				p.money += 1000;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		for (;p < a + n;p++)
		{
			if (p.money > max)
			{
				max = p.money;
			}
			sum += p.money;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=a;
		p.copyFrom(a);
		for (;p < a + n;p++)
		{
			if (p.money == max)
			{
				System.out.printf("%s\n%d\n",p.name,p.money);
				break;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

