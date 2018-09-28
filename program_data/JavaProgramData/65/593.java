package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int countA = 0;
		int countB = 0;
		int n;
		int a;
		int b;
		int t = 0;
		int i;
		double w;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				countA++;
				t++;
			}
			else if (a == b)
			{
				;
			}
			else
			{
				countB++;
				t++;
			}

		}

		w = 1.0 * countA / t;
		if (w > 0.5)
		{
			System.out.print("A");
		}
		else if (w == 0.5)
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

