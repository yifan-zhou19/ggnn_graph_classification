package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int a;
		int b;
		int k;
		int max;
		char c1;
		char c2;
		char[][] na = new char[100][100];
		int sum;
		int[] s = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		max = 0;
		for (i = 0;i < n;i++)
		{
			s[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				na[i] = tempVar2.charAt(0);
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
				c1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				c2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				k = Integer.parseInt(tempVar7);
			}
			if (a > 80 && k >= 1)
			{
				s[i] += 8000;
			}
			if (a > 85 && b > 80)
			{
				s[i] += 4000;
			}
			if (a > 90)
			{
				s[i] += 2000;
			}
			if (a > 85 && c2 == 'Y')
			{
				s[i] += 1000;
			}
			if (b > 80 && c1 == 'Y')
			{
				s[i] += 850;
			}
			sum += s[i];
			if (max < s[i])
			{
				max = s[i];
				m = i;
			}
		}
		System.out.printf("%s\n",na[m]);
		System.out.printf("%d\n",s[m]);
		System.out.printf("%d\n",sum);
		return 0;
	}

}

