package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int s1;
		int s2;
		int paper;
		int i;
		int[] money = new int[100];
		int m = 0;
		int sum = 0;
		int a;
		char[][] name = new char[100][20];
		char c1 = 0;
		char c2 = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			money[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
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
				paper = Integer.parseInt(tempVar7);
			}
			if (s1 > 80 && paper >= 1)
			{
				money[i] = money[i] + 8000;
			}
			if (s1 > 85 && s2 > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (s1 > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (s1 > 85 && c2 == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (s2 > 80 && c1 == 'Y')
			{
				money[i] = money[i] + 850;
			}
			if (money[i] > m)
			{
				m = money[i];
				a = i;
			}
			 sum = sum + money[i];

		 }
		  System.out.printf("%s\n%d\n%d",name[a],m,sum);

	}

}

