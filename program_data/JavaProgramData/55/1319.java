package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String x = new String(new char[200]);
	   String y = new String(new char[200]);
	   int a;
	   int b;
	   int i;
	   int j;
	   int[] num = new int[200];
	   int n = 0;
	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  x = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int nlen1 = x.length();

	   for (i = 0;i <= nlen1 - 1;i++)
	   {
		   if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
		   {
			   num[i] = x.charAt(i) - '0';
		   }
		   else if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
		   {
			   num[i] = x.charAt(i) - 'a' + 10;
		   }
		   else if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
		   {
			   num[i] = x.charAt(i) - 'A' + 10;
		   }
		   n += num[i] * ((int)Math.pow(a,(nlen1 - 1 - i)));
	   }
	if (n != 0)
	{
	   for (i = 0;n >= b;i++)
	   {
		   num[i] = n % b;
		   n = (n - num[i]) / b;
	   }
	   if (n > 0)
	   {
		   num[i] = n;
	   }
	   else
	   {
		   i -= 1;
	   }
	   for (j = i;j >= 0;j--)
	   {
		  if (num[j] >= 0 && num[j] <= 9)
		  {
			  System.out.print(num[j]);
		  }
		  else
		  {
			  y = tangible.StringFunctions.changeCharacter(y, j, num[j] - 10 + 'A');
		  System.out.print(y.charAt(j));
		  }
	   }
	}
	else
	{
		System.out.print(0);
	}

	return 0;


	}


}

