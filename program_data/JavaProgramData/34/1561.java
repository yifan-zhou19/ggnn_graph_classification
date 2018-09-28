package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int YS;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			do
			{
			   YS = n % 2; //??????
			   if (YS != 0) // ????????3?1
			   {
						m = n;
						n = 3 * m + 1;
						System.out.print(m);
						System.out.print("*3");
						System.out.print("+1=");
						System.out.print(n);
						System.out.print("\n");
			   }
			   else // ?????????2
			   {
				   m = n;
				   n = m / 2;
				   System.out.print(m);
				   System.out.print("/2");
				   System.out.print("=");
				   System.out.print(n);
				   System.out.print("\n");
			   }
			}while (n != 1);
			 System.out.print("End");
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}
}

