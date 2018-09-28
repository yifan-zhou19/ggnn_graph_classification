package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int mu = -1;
		int min = 0;
		int i;
		int k;
		char dot;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			dot = tempVar2.charAt(0);
		}
		if (dot != ',')
		{
			System.out.print("No");
			min = 1;
		}
		for (i = 0;dot == ',';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			if (k > max)
			{
				mu = max;
				max = k;
			}
			else if (k < max && k> mu)
			{
				mu = k;
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				dot = tempVar4.charAt(0);
			}
		}
		if (min == 0 && mu == -1)
		{
			System.out.print("No");
		}
		else if (min == 0 && mu != -1)
		{
			System.out.printf("%d",mu);
		}
	}



}

