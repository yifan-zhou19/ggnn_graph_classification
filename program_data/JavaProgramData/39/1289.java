package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int max = 0;
		int[] stu = new int[100];
		int[] com = new int[100];
		int[] paper = new int[100];
		int[] money = new int[100];
		char[][] name = new char[100][20];
		String cadre = new String(new char[100]);
		String west = new String(new char[100]);
		String best = new String(new char[20]);
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
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				com[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				cadre = tangible.StringFunctions.changeCharacter(cadre, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				west = tangible.StringFunctions.changeCharacter(west, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				paper[i] = Integer.parseInt(tempVar7);
			}
			if (stu[i] > 80 && paper[i] > 0)
			{
				money[i] += 8000;
			}
			if (stu[i] > 85 && com[i] > 80)
			{
				money[i] += 4000;
			}
			if (stu[i] > 90)
			{
				money[i] += 2000;
			}
			if (stu[i] > 85 && west.charAt(i) == 'Y')
			{
				money[i] += 1000;
			}
			if (com[i] > 80 && cadre.charAt(i) == 'Y')
			{
				money[i] += 850;
			}
			if (money[i] > max)
			{
				max = money[i];
				best = name[i];
			}
			sum += money[i];
		}
		System.out.printf("%s\n%d\n%d",best,max,sum);
	}
}

