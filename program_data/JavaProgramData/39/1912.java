package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[20]);
		String y = new String(new char[20]);
		char k;
		char l;
		int n;
		int a;
		int b;
		int c;
		int sum;
		int i;
		int j;
		int max = 0;
		int max2 = 0;
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
				x = tempVar2.charAt(0);
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
				k = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				l = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c = Integer.parseInt(tempVar7);
			}
			sum = 0;
			if ((a > 80) && (c != 0))
			{
				sum = sum + 8000;
			}
			if ((a > 85) && (b > 80))
			{
				sum = sum + 4000;
			}
			if (a > 90)
			{
				sum = sum + 2000;
			}
			if ((a > 85) && (l == 'Y'))
			{
				sum = sum + 1000;
			}
			if ((b > 80) && (k == 'Y'))
			{
				sum = sum + 850;
			}
			if (sum > max)
			{
				max = sum;
				for (j = 0;j < 20;j++)
				{
				y = tangible.StringFunctions.changeCharacter(y, j, x.charAt(j));
				}
			}
			max2 = max2 + sum;

		}
		System.out.printf("%s\n%d\n%d\n",y,max,max2);
		return 0;
	}
}

