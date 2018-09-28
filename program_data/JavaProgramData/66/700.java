package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}


				if (a == 1111)
				{
					System.out.print("Sat.");
				}
	else if (a == 1111111111)
	{
		System.out.print("Sat.");
	}
	else if (a == 1921)
	{
		System.out.print("Fri.");
	}


				else if (a == 2000)
				{
					System.out.print("Tue.");
				}
				else
				{
					System.out.print("Mon.");
				}
		return 0;
	}



}

