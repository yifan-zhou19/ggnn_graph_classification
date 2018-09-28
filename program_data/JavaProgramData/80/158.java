package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sY;
		int sM;
		int sD;
		int eY;
		int eM;
		int eD;
		int d1;
		int i;
		int d2;
		int j;
		int d3;
		int k;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sY = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sM = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sD = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			eY = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			eM = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			eD = Integer.parseInt(tempVar6);
		}
		d1 = (sM - 1) * 31 + sD;
		sM = sM - 1;
		for (i = 0;sM >= 1;sM = sM - 1)
		{
			if (sM == 4 || sM == 6 || sM == 9 || sM == 11)
			{
				i = i + 1;
			}
			else if (sM == 2)
			{
				if ((sY % 4 == 0 && sY % 100 != 0) || (sY % 400 == 0))
				{
					i = i + 2;
				}
				else
				{
					i = i + 3;
				}
			}
		}
		d1 = d1 - i;
		d2 = (13 - eM) * 31 - eD;
		for (j = 0;eM <= 12;eM = eM + 1)
		{
			if (eM == 4 || eM == 6 || eM == 9 || eM == 11)
			{
				j++;
			}

			else if (eM == 2)
			{
				if ((eY % 4 == 0 && eY % 100 != 0) || (eY % 400 == 0))
				{
					j = j + 2;
				}
				else
				{
					j = j + 3;
				}
			}
		}
		d2 = d2 - j;
		d3 = (eY - sY + 1) * 365;
		for (k = 0;sY <= eY;sY = sY + 1)
		{
				if ((sY % 4 == 0 && sY % 100 != 0) || (sY % 400 == 0))
				{
					k++;
				}
		}
		d3 = d3 + k;
		d = d3 - d1 - d2;
		System.out.printf("%d",d);
	}



}

