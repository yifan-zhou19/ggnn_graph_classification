package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[20]);
		String g = new String(new char[20]);
		char d;
		char e;
		int b;
		int c;
		int f;
		int n;
		int sum = 0;
		int max = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int sum1 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
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
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f = Integer.parseInt(tempVar7);
			}
			if (b > 80 && f >= 1)
			{
				sum1 += 8000;
			}
			if (b > 85 && c > 80)
			{
				sum1 += 4000;
			}
			if (b > 90)
			{
				sum1 += 2000;
			}
			if (b > 85 && e == 'Y')
			{
				sum1 += 1000;
			}
			if (c > 80 && d == 'Y')
			{
				sum1 += 850;
			}
			sum += sum1;
			if (sum1 > max)
			{
				max = sum1;
				for (j = 0;j < 20;j++)
				{
					g = tangible.StringFunctions.changeCharacter(g, j, a.charAt(j));
				}
			}
		}
		System.out.printf("%s\n%d\n%d\n",g,max,sum);
	}
}

