package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int[] a = new int[3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
		{
			System.out.print("n");
		}
		else
		{
			if (n % 3 == 0)
			{
				System.out.print("3");
				count++;
			}

			if (n % 5 == 0)
			{
				if (count == 1)
				{
					System.out.print(" 5");
				}
				if (count == 0)
				{
					System.out.print("5");
				}
				count++;
			}
			if (n % 7 == 0)
			{
				if (count == 0)
				{
					System.out.print("7");
				}
				else
				{
					System.out.print(" 7");
				}
			}



		}

		return 0;
	}

}

