package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
			   b = b + 1;
		}
		   else
		   {
			   b = b + 20;
		   }
		if (a % 5 == 0)
		{
			   b = b + 3;
		}
		   else
		   {
			   b = b + 20;
		   }
		if (a % 7 == 0)
		{
			   b = b + 5;
		}
		   else
		   {
			   b = b + 20;
		   }
		if (b == 9)
		{
			System.out.print("3 5 7");
		}
		else
		{
		}
		if (b == 24)
		{
			System.out.print("3 5");
		}
		else
		{
		}
		if (b == 26)
		{
			System.out.print("3 7");
		}
		else
		{
		}
		if (b == 28)
		{
			System.out.print("5 7");
		}
		else
		{
		}
	   if (b == 41)
	   {
		   System.out.print("3");
	   }
	   else
	   {
	   }
		if (b == 43)
		{
			System.out.print("5");
		}
		else
		{
		}
			if (b == 45)
			{
				System.out.print("7");
			}
			else
			{
			}
		if (b == 60)
		{
			System.out.print('n');
		}
		else
		{
		}
	return 0;
	}

}

