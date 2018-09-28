package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
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
			if (((c + 1) == d) || ((c - 2) == d))
			{
				a++;
			}
			 else if (((d + 1) == c) || ((d - 2) == c))
			 {
				b++;
			 }
		}

		if (a < b)
		{
			System.out.print("B");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("A");
		}




			return 0;
	}
}

