package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b, tangible.RefObject<String> p)
	{
		 int m;
		 int n;
		 m = a.length();
		 n = b.length();
		 if (n > m)
		 {
				for (int i = 0;i + m < n;i++)
				{
				p.argValue.charAt(i) = b[i];
				}
		 }
		 p.argValue.charAt(n - m) = '0';
		 for (int i = 0;i < m;i++)
		 {
			 if (a[m - 1 - i] + b[n - 1 - i] - '0'-'0' < 10 != null)
			 {
			 p.argValue.charAt(n - i) = a[m - 1 - i] + b[n - 1 - i] - '0';
			 }
			 else
			 {
				 p.argValue.charAt(n - i) = a[m - 1 - i] + b[n - 1 - i] - '0' - 10;
				 b[n - 2 - i] = b[n - 2 - i].Substring(1);
			 }
		 }
		 if (a[0] + b[n - m] - '0'-'0' >= 10 != null)
		 {
		 p.argValue.charAt(n - m)++;
		 }
		 p.argValue = p.argValue.substring(0, n + 1);
		 if (p.argValue.charAt(n - m) == '0')
		 {
					  for (int i = n - m;i < n;i++)
					  {
					  p.argValue.charAt(i) = p.argValue.charAt(i + 1);
					  }
					  p.argValue = p.argValue.substring(0, n);
		 }
		 else if (n > m)
		 {
					  for (int i = n - m;i < n;i++)
					  {
					  p.argValue.charAt(i) = p.argValue.charAt(i + 1);
					  }
					  p.argValue = p.argValue.substring(0, n);
					  for (int i = 0;i < n - m;i++)
					  {
							  if (p.argValue.charAt(n - m - 1 - i) < '9')
							  {
											  p.argValue.charAt(n - m - 1 - i)++;
											  break;
							  }
							  else
							  {
							  p.argValue.charAt(n - m - 1 - i) = '0';
							  }
					  }
		 }
		 if (p.argValue.charAt(0) == '0' && p.argValue.charAt(1) != 0)
		 {
					  for (int i = 0;i < n + 1;i++)
					  {
					  p.argValue.charAt(n + 1 - i) = p.argValue.charAt(n - i);
					  }
					  p.argValue.charAt(0) = '1';
		 }

	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		int m;
		int n;
		int i;
		m = a.length();
		n = b.length();
		while (a.charAt(0) == '0' && a.charAt(1) != 0)
		{
					 for (int j = 0;j < m;j++)
					 {
					 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					 }
					 m--;
					 a = a.substring(0, m);
		}
		while (b.charAt(0) == '0' && b.charAt(1) != 0)
		{
					 for (int j = 0;j < n;j++)
					 {
					 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					 }
					 n--;
					 b = b.substring(0, n);
		}
		if (m > n)
		{
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		f(b, a, tempRef_c);
		c = tempRef_c.argValue;
		}
		else
		{
	tangible.RefObject<String> tempRef_c2 = new tangible.RefObject<String>(c);
		f(a, b, tempRef_c2);
		c = tempRef_c2.argValue;
		}
		System.out.printf("%s\n",c);
	}
}

