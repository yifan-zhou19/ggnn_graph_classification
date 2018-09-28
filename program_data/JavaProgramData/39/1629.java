package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int b;
		int c;
		int f;
		int i;
		int j;
		int max = 0;
		int s;
		int S = 0;
		String a = new String(new char[21]);
		char d;
		char e;
		String name = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				d = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				e = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				f = Integer.parseInt(tempVar7);
			}
			if (b > 80 && f >= 1)
			{
				s = s + 8000;
			}
			if (b > 85 && c > 80)
			{
				s = s + 4000;
			}
			if (b > 90)
			{
				s = s + 2000;
			}
			if (b > 85 && e == 'Y')
			{
				s = s + 1000;
			}
			if (c > 80 && d == 'Y')
			{
				s = s + 850;
			}
			if (s > max)
			{
				for (j = 0;j <= a.length();j++)
				{
					name = tangible.StringFunctions.changeCharacter(name, j, a.charAt(j));
				}
				max = s;
			}
			S = S + s;
		}
		System.out.printf("%s\n%d\n%d\n",name,max,S);
	}
}

