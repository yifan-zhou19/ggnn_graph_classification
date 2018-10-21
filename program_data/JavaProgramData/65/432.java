package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sza = new int[200];
		int[] szb = new int[200];
		int a = 0;
		int b = 0;
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
				(sza[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(szb[i]) = Integer.parseInt(tempVar3);
			}
			if ((sza[i] == 0 && szb[i] == 1) || (sza[i] == 1 && szb[i] == 2) || (sza[i] == 2 && szb[i] == 0))
			{
				a++;
			}
			else if ((szb[i] == 0 && sza[i] == 1) || (szb[i] == 1 && sza[i] == 2) || (szb[i] == 2 && sza[i] == 0))
			{
				b++;
			}
			else if (sza[i] = szb[i])
			{
				continue;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else
		{
			if (a > b)
			{
			System.out.print("A");
			}
		else
		{
			System.out.print("B");
		}
		}
		 return 0;
	}



}

