package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int i;
		int a = 0;
		int b = 0;
		int m;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}

		for (i = 0;i < q;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			if (m == 0 && n == 1)
			{
				a++;
			}
			else if (m == 0 && n == 2)
			{
				b++;
			}

			else if (m == 1 && n == 2)
			{
				a++;
			}
			else if (m == 1 && n == 0)
			{
				b++;
			}

			else if (m == 2 && n == 0)
			{
				a++;
			}
			else if (m == 2 && n == 1)
			{
				b++;
			}
		}

		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}









		return 0;
	}
}

