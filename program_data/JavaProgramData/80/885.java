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
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int pD = 0;
		int spD = 0;
		int epD = 0;
		int ypD = 0;
		int i;
		sY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sD = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eY = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eD = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (sY % 4 == 0 && sY % 100 != 0 || sY % 400 == 0)
		{
			for (i = 1; i < sM; i++)
			{
				spD += month2[i - 1];
			}
			spD += sD;
			spD = 366 - spD;
		}
		else
		{
			for (i = 1; i < sM; i++)
			{
				spD += month1[i - 1];
			}
			spD += sD;
			spD = 365 - spD;
		}
		if (eY % 4 == 0 && eY % 100 != 0 || eY % 400 == 0)
		{
			for (i = 1; i < eM; i++)
			{
				epD += month2[i - 1];
			}
			epD += eD;
		}
		else
		{
			for (i = 1; i < eM; i++)
			{
				epD += month1[i - 1];
			}
			epD += eD;
		}
		if (sY == eY)
		{
			if (sY % 4 == 0 && sY % 100 != 0 || sY % 400 == 0)
			{
				pD = spD + epD - 366;
			}
			else
			{
				pD = spD + epD - 365;
			}
		}
		else
		{
			for (i = sY + 1; i < eY; i++)
			{
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					ypD += 366;
				}
				else
				{
					ypD += 365;
				}
			}
			pD = spD + epD + ypD;
		}
		System.out.print(pD);
		System.out.print("\n");
		return 0;
	}
}

