package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int e;
		int max1 = 0;
		int max2 = 0;
		String name = new String(new char[100]);
		String NAME = new String(new char[100]);
		int[] sum = new int[100];
		char c;
		char d;
		int[] s = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 5;j++)
			{
				s[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				e = Integer.parseInt(tempVar7);
			}
			if (a > 80 && e >= 1)
			{
				s[0]++;
			}
			if (a > 85 && b > 80)
			{
				s[1]++;
			}
			if (a > 90)
			{
				s[2]++;
			}
			if (a > 85 && d == 'Y')
			{
				s[3]++;
			}
			if (b > 80 && c == 'Y')
			{
				s[4]++;
			}
			sum[i] = 8000 * s[0] + 4000 * s[1] + 2000 * s[2] + 1000 * s[3] + 850 * s[4];
			if (sum[i] > max1)
			{
				max1 = sum[i];
				NAME = name;
				for (j = 0;j < 100;j++)
				{
					name = tangible.StringFunctions.changeCharacter(name, j, '\0');
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max2 = max2 + sum[i];
		}
		System.out.printf("%s\n%d\n%d\n",NAME,max1,max2);
	}
}

