package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 1;
			if (a % 3 == 0)
			{
				System.out.print("3");
				b++;
			}
			if (a % 5 == 0)
			{
				if (b == 1)
				{
					System.out.print("5");
					b++;
				}
				else
				{
				System.out.print(" 5");
				}
			}
			if (a % 7 == 0)
			{
				if (b == 1)
				{
					System.out.print("7");
					b++;
				}
				else
				{
				System.out.print(" 7");
				}
			}
		if (b == 1)
		{
			System.out.print("n");
		}
	}

}

