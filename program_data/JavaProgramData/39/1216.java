package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int[] Endmark = new int[100];
		int[] Classmark = new int[100];
		int[] Essay = new int[100];
		int[] award = new int[100];
		int sum = 0;
		int BP;
		int X;
		char[][] Name = new char[100][21];
		String Zone = new String(new char[100]);
		String Leader = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				Endmark[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				Classmark[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				Leader = tangible.StringFunctions.changeCharacter(Leader, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				Zone = tangible.StringFunctions.changeCharacter(Zone, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				Essay[i] = Integer.parseInt(tempVar7);
			}
			if (Endmark[i] > 80 && Essay[i] > 0)
			{
				award[i] += 8000;
			}
			if (Endmark[i] > 85 && Classmark[i] > 80)
			{
				award[i] += 4000;
			}
			if (Endmark[i] > 90)
			{
				award[i] += 2000;
			}
			if (Endmark[i] > 85 && Zone.charAt(i) == 'Y')
			{
				award[i] += 1000;
			}
			if (Classmark[i] > 80 && Leader.charAt(i) == 'Y')
			{
				award[i] += 850;
			}
			sum += award[i];
		}
		BP = award[0];
		X = 0;
		for (i = 0;i < N;i++)
		{
			if (award[i] > BP)
			{
				BP = award[i];
				X = i;
			}
		}
		System.out.printf("%s\n",Name[X]);
		System.out.printf("%d\n",award[X]);
		System.out.printf("%d\n",sum);

	return 0;
	}

}

