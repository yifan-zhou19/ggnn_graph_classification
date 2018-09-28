package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 /*1) ????????8000??????????80??>80???????????1??1????????????? 
	2) ????????4000??????????85??>85????????????80??>80????????? 
	3) ????????2000??????????90??>90????????? 
	4) ????????1000??????????85??>85????????????? 
	5) ????????850??????????80??>80???????????
		???????????????????????????????????????????????????*/


		char[][] name = new char[1000][100];
		int[] fen = new int[1000];
		int[] ban = new int[1000];
		String gan = new String(new char[1000]);
		String xi = new String(new char[1000]);
		int[] lun = new int[1000];
		int[] jiang = new int[1000];
		int n;
		int i;
		int max;
		int xue;
		int sum;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fen[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				ban[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gan = tangible.StringFunctions.changeCharacter(gan, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tangible.StringFunctions.changeCharacter(xi, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lun[i] = Integer.parseInt(tempVar7);
			}
			jiang[i] = 0;
			if (fen[i] > 80 && lun[i] >= 1)
			{
				jiang[i] = 8000;
			}
			if (fen[i] > 85 && ban[i] > 80)
			{
				jiang[i] = jiang[i] + 4000;
			}
			if (fen[i] > 90)
			{
				jiang[i] = jiang[i] + 2000;
			}
			if (fen[i] > 85 && xi.charAt(i) == 'Y')
			{
				jiang[i] = jiang[i] + 1000;
			}
			if (ban[i] > 80 && gan.charAt(i) == 'Y')
			{
				jiang[i] = jiang[i] + 850;
			}
		}
		max = jiang[0];
		xue = 0;
		for (i = 0;i < n;i++)
		{
			if (jiang[i] > max)
			{
				max = jiang[i];
				xue = i;
			}
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + jiang[i];
		}
		System.out.printf("%s\n",name[xue]);
		System.out.printf("%d\n",jiang[xue]);
		System.out.printf("%d\n",sum);
	}


}

