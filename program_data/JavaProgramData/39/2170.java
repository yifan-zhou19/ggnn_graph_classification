package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sum = new int[100];
		int total = 0;
		char[][] name = new char[100][20];
		for (i = 0;i < n;i++)
		{
			int a;
			int b;
			char p;
			char q;
			int l;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
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
				p = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				q = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				l = Integer.parseInt(tempVar7);
			}
			if (a > 80 && l != 0)
			{
				sum[i] += 8000;
			}
			if (a > 85 && b > 80)
			{
				sum[i] += 4000;
			}
			if (a > 90)
			{
				sum[i] += 2000;
			}
			if (a > 85 && q == 'Y')
			{
				sum[i] += 1000;
			}
			if (b > 80 && p == 'Y')
			{
				sum[i] += 850;
			}
			total += sum[i];
		}
		int max = 0;
		int k;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				k = i;
			}
		}
		System.out.printf("%s\n", name[k]);
		System.out.printf("%d\n", sum[k]);
		System.out.printf("%d\n", total);
		return 0;
	}
}

