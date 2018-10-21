package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			String s = new String(new char[20]);
			String t = new String(new char[20]);
			int a;
			int b;
			int e;
			int m;
			int sum = 0;
			int max = 0;
			char c;
			char d;
		for (int i = 0;i < n;i++)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				e = Integer.parseInt(tempVar7);
			}
			if (a > 80 && e >= 1)
			{
				m = m + 8000;
			}
			if (a > 85 && b > 80)
			{
				m = m + 4000;
			}
			if (a > 90)
			{
				m = m + 2000;
			}
			if (a > 85 && d == 'Y')
			{
				m = m + 1000;
			}
			if (b > 80 && c == 'Y')
			{
				m = m + 850;
			}
			if (m > max)
			{
				max = m;
								int j;
				for (j = 0;s.charAt(j) != '\0';j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(j));
				}
								t = tangible.StringFunctions.changeCharacter(t, j, '\0');
			}

		sum = sum + m;
		}
		System.out.printf("%s\n%d\n",t,max);
		System.out.printf("%d",sum);
		return 0;
	}
}

