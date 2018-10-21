package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] qimo = new int[100];
		int[] banyi = new int[100];
		int[] lunwen = new int[100];
		char[][] name = new char[100][20];
		String xuegan = new String(new char[100]);
		String xibu = new String(new char[100]);
		int[] sum = new int[100];
		int a;
		int b = 0;
		int i;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				banyi[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				xuegan = tangible.StringFunctions.changeCharacter(xuegan, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lunwen[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0; i < n; i++)
		{
			if ((qimo[i] > 80) && (lunwen[i] != 0))
			{
				sum[i] += 8000;
			}
			if ((qimo[i] > 85) && (banyi[i] > 80))
			{
				sum[i] += 4000;
			}
			if (qimo[i] > 90)
			{
				sum[i] += 2000;
			}
			if ((qimo[i] > 85) && (xibu.charAt(i) == 'Y'))
			{
				sum[i] += 1000;
			}
			if ((banyi[i] > 80) && (xuegan.charAt(i) == 'Y'))
			{
				sum[i] += 850;
			}
		}
		for (i = 0; i < n; i++)
		{
			result += sum[i];
			if (sum[i] > b)
			{
				b = sum[i];
				a = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n", name[a], b, result);
		return 0;
	}
}

