public class student
{
	public String name = new String(new char[20]);
	public int a;
	public int b;
	public char cla;
	public char west;
	public int paper;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int n;
		int i;
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
				s[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].cla = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i].paper = Integer.parseInt(tempVar7);
			}
			s[i].total = 0;
			if (s[i].a > 80 && s[i].paper >= 1)
			{
				s[i].total += 8000;
			}
			if (s[i].a > 85 && s[i].b > 80)
			{
				s[i].total += 4000;
			}
			if (s[i].a > 90)
			{
				s[i].total += 2000;
			}
			if (s[i].a > 85 && s[i].west == 'Y')
			{
				s[i].total += 1000;
			}
			if (s[i].b > 80 && s[i].cla == 'Y')
			{
				s[i].total += 850;
			}
			sum += s[i].total;
		}
		for (i = 1;i < n;i++)
		{
			if (s[i].total > s[0].total)
			{
				s[0] = s[i];
			}
		}
		System.out.printf("%s\n",s[0].name);
		System.out.printf("%d\n",s[0].total);
		System.out.printf("%d",sum);

		return 0;
	}



}

