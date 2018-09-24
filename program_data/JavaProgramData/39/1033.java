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
		int i;
		int sum = 0;
		int max = 0;
		String t = new String(new char[30]);
		for (i = 0;i < n;i++)
		{
			String p = new String(new char[30]);
			char c;
			char v;
			int m;
			int k;
			int b;
			int g = 0;
			int z = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				k = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				v = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				b = Integer.parseInt(tempVar7);
			}
			if (m > 80 && b >= 1)
			{
				g = g + 8000;
			}
			if (m > 85 && k > 80)
			{
				g = g + 4000;
			}
			if (m > 90)
			{
				g = g + 2000;
			}
			if (m > 85 && v == 'Y')
			{
				g = g + 1000;
			}
			if (k > 80 && c == 'Y')
			{
				g = g + 850;
			}
			if (g > max)
			{
				max = g;
				z = p.length();
				for (int h = 0;h < z;h++)
				{
					t = tangible.StringFunctions.changeCharacter(t, h, p.charAt(h));
				}
				t = tangible.StringFunctions.changeCharacter(t, z, '\0');
			}
			else
			{
				max = max;
			}
			sum = sum + g;
		}
		System.out.printf("%s\n%d\n%d",t,max,sum);
		return 0;
	}

}

