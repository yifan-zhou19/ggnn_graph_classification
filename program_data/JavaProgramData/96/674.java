package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int m = 0;
		int n;
		int[] a = new int[100];
		int b = 0;
		int i;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = s.length();
		if (n == 1)
		{
			m = s.charAt(0) - '0';
			System.out.print("0");
			System.out.print("\n");
			System.out.print(m);
			System.out.print("\n");
		}
		else
		{
		  if (n == 2)
		  {
			  m = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
			  b = m / 13;
			  m = m % 13;
			  System.out.print(b);
			  System.out.print("\n");
			  System.out.print(m);
			  System.out.print("\n");
		  }
		  else
		  {
			m = s.charAt(0) - '0';
		   for (i = 1; i < n; i++)
		   {
			   m = m * 10 + s.charAt(i) - '0';
			   b = m / 13;
			   m = m % 13;
			   a[i - 1] = b;
		   }
		   n--;
		   if (a[0] == 0)
		   {
			   i = 1;
		   }
		   else
		   {
			   i = 0;
		   }
		   for (; i < n; i++)
		   {
			   System.out.print(a[i]);
		   }
		   System.out.print("\n");
		   System.out.print(m);
		  }
		}
		return 0;
	}

}

