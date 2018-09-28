package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   w = Integer.parseInt(tempVar);
	   }
		for (;(c = System.in.read()) != EOF;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = Integer.parseInt(tempVar2);
			}
			if (w == 1)
			{
				System.out.print("4\n7");
			}
			else if (w == 2)
			{
				System.out.print("9\n12");
			}
			else if (w == 3)
			{
				System.out.print("6");
			}
			else if (w == 4)
			{
				System.out.print("2\n3\n11");
			}
			else if (w == 5)
			{
				System.out.print("8");
			}
			else if (w == 6)
			{
				System.out.print("5");
			}
			else if (w == 7)
			{
				System.out.print("1\n10");
			}
			System.out.print("\n");
		}
	}

}

