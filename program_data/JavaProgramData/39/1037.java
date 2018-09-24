package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int[] j = new int[100];
		int[] j1 = new int[100];
		int sum = 0;
		char m;
		char l;
		char[][] s = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			j[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
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
				m = tempVar5.charAt(0);
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
			if (a > 80 && c >= 1)
			{
				j[i] = j[i] + 8000;
			}
			if (a > 85 && b > 80)
			{
				j[i] = j[i] + 4000;
			}
			if (a > 90)
			{
				j[i] = j[i] + 2000;
			}
			if (l == 'Y' && a > 85)
			{
				j[i] = j[i] + 1000;
			}
			if (m == 'Y' && b > 80)
			{
				j[i] = j[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + j[i];
			j1[i] = j[i];
		}
		for (i = 0;i < n;i++)
		{
			if (j[i] > j[i + 1])
			{
				j[i + 1] = j[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (j1[i] == j[n - 1])
			{
				System.out.printf("%s\n",s[i]);
			System.out.printf("%d\n",j[n - 1]);
			break;
			}
		}
			System.out.printf("%d\n",sum);
			return 0;
	}







}

