package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int fh;
		 int a;
		 int b;
		 int sum;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 sum = 0;
		 for (int i = 1;i <= n;i++)
		 {
			 a = i;
			 fh = 1;
			 if (a % 7 == 0)
			 {
				 fh = 0;
			 }
			  do
			  {
				   b = a % 10;
				   a = a / 10;
				   if (b == 7)
				   {
					   fh = 0;
				   }
			  } while (a > 0);
			 sum = sum + i * i * fh;
		 }
		  System.out.print(sum);
		return 0;
	}



}

