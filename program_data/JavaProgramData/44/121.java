package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int g = n;
		int a = 0;
		int b = 0;
			while (g != 0)
			{

				  a = g % 10;
				  b = b * 10 + a;
				  g = g / 10;

			}


		return b;

	}



	public static int Main()
	{
	 int n;
	 int b;
	 int i;
	for (i = 0;i <= 5;i++)
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 b = reverse(n);
	 System.out.printf("%d\n",b);
	}


	}

}

