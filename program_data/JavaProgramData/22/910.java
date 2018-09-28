package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int max2;
		max2 = 0;
		char sep;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			sep = tempVar2.charAt(0);
		}
		while (sep == ',')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				sep = tempVar4.charAt(0);
			}
			if (b > a)
			{
				max2 = a;
				a = b;
			}
			else
			{
				if (b > max2 && b != a)
				{
					max2 = b;
				}
			}
		}
		if (max2 != 0)
		{
			System.out.printf("%d",max2);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

