package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		char t;
		int[] d = new int[100]; //??????????
		int a; //a,b????????
		int b;
		int n;
		int i = 0;
		int lc;
		int number = 0;
		int decimal = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (c.charAt(0) == '0')
		{
			System.out.print('0');
		}
		lc = c.length();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
		   if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
		   {
			   decimal = c.charAt(i) - '0';
		   }
		   if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
		   {
			  decimal = c.charAt(i) - 'A' - 22;
		   }
		   if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
		   {
			   decimal = c.charAt(i) - 'A' + 10;
		   }
		   number = number * a + decimal;
		}
		//cout<<number<<endl;
		i = 0;
		while (number > 0)
		{
		   d[i] = number % b;
		   number = number - d[i];
		   number /= b;
		   i++;
		}
		i--;
		for (;i >= 0;i--)
		{
		  if (d[i] >= 10)
		  {
			  t = d[i] + 'A' - 10;
			  System.out.print(t);
		  }
		  else
		  {
		  System.out.print(d[i]);
		  }
		}

		  int ss;
		  ss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  return 0;
	}



}

