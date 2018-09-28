package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String x = new String(new char[100]);
	   int[] y = new int[100];
	   int i;
	   int n;
	   int m;
	   int sum = 0;
	   int j = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   x = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = x.length() - 1; i >= 0; i--)
	   {
		   if (x.charAt(i) <= '9')
		   {
				sum = sum + (x.charAt(i) - '0') * Math.pow(1.0 * n, 1.0 * x.length() - i - 1);
		   }
		   else if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
		   {
				sum = sum + (x.charAt(i) - 'A' + 10) * Math.pow(1.0 * n, 1.0 * x.length() - i - 1);
		   }
		   else
		   {
				sum = sum + (x.charAt(i) - 'a' + 10) * Math.pow(1.0 * n, 1.0 * x.length() - i - 1);
		   }
	   }
	   if (sum == 0)
	   {
		   System.out.print(0);
		   System.out.print("\n");
	   }
	   while (sum != 0)
	   {
		   y[j++] = sum % m;
		   sum = sum / m;
	   }
	   for (i = j - 1; i >= 0; i--)
	   {
		   if (y[i] <= 9)
		   {
			   System.out.print(y[i]);
		   }
		   else
		   {
			   System.out.print((char)(y[i] - 10 + 'A'));
		   }
	   }
	   System.out.print("\n");
	   return 0;
	}

}

