package <missing>;

public class GlobalMembers
{
	// pro.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int n;
		int b;
		int c = 11;
		int i = 1;
		int j = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		if (n == 0)
		{
			System.out.printf("%d",n);
		}
		else
		{


			while (n > 0)
			{

				b = n % 10;
				System.out.printf("%d",b);
				n = n / 10;


			}
		}

	}

}

