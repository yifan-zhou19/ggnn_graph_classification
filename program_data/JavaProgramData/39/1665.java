package <missing>;

public class GlobalMembers
{
	public static char[][] name = new char[200][21];
	public static int[] qmg = new int[200];
	public static int[] cg = new int[200];
	public static String gb = new String(new char[200]);
	public static String xb = new String(new char[200]);
	public static int[] lw = new int[200];
	public static int[] schsum = new int[200];


	public static int Main()
	{
		int n;
		int i;
		int num;
		int whole;
		String str1 = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int j;
			String str2 = new String(new char[21]);
			char x4;
			char x5;
			int x2;
			int x3;
			int x6;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str2 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				x3 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				x4 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				x5 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				x6 = Integer.parseInt(tempVar7);
			}
			for (j = 0;j < 21;j++)
			{
				name[i][j] = str2.charAt(j);
			}
			qmg[i] = x2;
			cg[i] = x3;
			gb = tangible.StringFunctions.changeCharacter(gb, i, x4);
			xb = tangible.StringFunctions.changeCharacter(xb, i, x5);
			lw[i] = x6;
			//puts(str2);
		}

		for (i = 0;i < n;i++)
		{
			schsum[i] = 0;
			if (qmg[i] > 80 && lw[i] >= 1)
			{
				schsum[i] += 8000;
			}
			if (qmg[i] > 85 && cg[i] > 80)
			{
				schsum[i] += 4000;
			}
			if (qmg[i] > 90)
			{
				schsum[i] += 2000;
			}
			if (xb.charAt(i) == 'Y' && qmg[i] > 85)
			{
				schsum[i] += 1000;
			}
			if (gb.charAt(i) == 'Y' && cg[i] > 80)
			{
				schsum[i] += 850;
			}
		}

		num = 0;
		for (i = 1;i < n;i++)
		{
			if (schsum[num] < schsum[i])
			{
				num = i;
			}
		}


		for (i = 0;i < 21;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, name[num][i]);
		}

		System.out.println(str1);
		System.out.printf("%d\n",schsum[num]);

		whole = 0;
		for (i = 0;i < n;i++)
		{
			whole += schsum[i];
		}

		System.out.printf("%d",whole);
		//printf("%d %d %d %d" ,schsum[0],schsum[1],schsum[2],schsum[3]);
		return 0;
	}


}

