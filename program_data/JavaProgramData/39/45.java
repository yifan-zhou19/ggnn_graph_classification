package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int m;
		int s1;
		int s2;
		int max = 0;
		int sum = 0;
		int t;
		String name = new String(new char[20]);
		String maxname = new String(new char[20]);
		char t1;
		char t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				t1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				t2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				m = Integer.parseInt(tempVar7);
			}
			if (s1 > 80 && m >= 1)
			{
				t += 8000;
			}
			if (s1 > 85 && s2 > 80)
			{
				t += 4000;
			}
			if (s1 > 90)
			{
				t += 2000;
			}
			if (s1 > 85 && t2 == 'Y')
			{
				t += 1000;
			}
			if (s2 > 80 && t1 == 'Y')
			{
				t += 850;
			}
			sum += t;
			if (t > max)
			{
				maxname = name;
				max = t;
			}
		}
		System.out.printf("%s\n%d\n%d\n",maxname,max,sum);
		return 0;
	}

}

