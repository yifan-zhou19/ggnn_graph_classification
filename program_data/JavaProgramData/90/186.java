package <missing>;

public class GlobalMembers
{
	public static int ways(int apple,int plate)
	{
		int waynumber;
		if (plate == 1 || apple == 1 || apple == 0)
		{
			waynumber = 1;
		}
		else if (apple < plate)
		{
			waynumber = ways(apple, apple);
		}
		else
		{
			waynumber = ways(apple, plate-1) + ways(apple - plate, plate);
		}
		return waynumber;
	}
	public static int Main()
	{
		int[] applenumber = new int[20];
		int[] platenumber = new int[20];
		int n;
		int i;
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
				applenumber[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				platenumber[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",ways(applenumber[i], platenumber[i]));
		}
		return 0;
	}

}

