package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int n;
		int i = 0;
		int a = 0;
		int b = 0;
		int c;
		int d;
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
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if ((c == 0 && d == 1) || (c == 1 && d == 2) || (c == 2 && d == 0))
			{
				a++;
			}
			else if (c == d)
			{
				b++;
				a++;
			}
			else
			{
				b++;
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else
		{
			System.out.print("B");
		}






		return 0;
	}

}

