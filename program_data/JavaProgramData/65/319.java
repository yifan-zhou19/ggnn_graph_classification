package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int suma = 0;
		int sumb = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			int b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (b - a == 1 || b - a == -2)
			{
				suma++;
			}
			if (a - b == 1 || a - b == -2)
			{
				sumb++;
			}
		}
		if (suma > sumb)
		{
			System.out.print("A");
		}
		if (suma < sumb)
		{
			System.out.print("B");
		}
		if (suma == sumb)
		{
			System.out.print("Tie");
		}
	}

}

