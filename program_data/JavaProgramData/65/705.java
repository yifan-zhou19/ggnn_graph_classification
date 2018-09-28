package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int suma;
		int sumb;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		suma = 0;
		sumb = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((b - a == 1) || (a - b == 2))
			{
				suma++;
			}
			if ((a - b == 1) || (b - a == 2))
			{
				sumb++;
			}
		}
		if (suma > sumb)
		{
			System.out.print("A");
		}
		else if (suma == sumb)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}

}

