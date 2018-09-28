package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b, tangible.RefObject<String> p)
	{
		 int m;
		 int n;
		 m = a.length();
		 n = b.length();
		 for (int i = 0;i < m;i++)
		 {
			 if (b[n - 1 - i] - a[m - 1 - i] >= 0 != null)
			 {
			 p.argValue.charAt(n - 1 - i) = b[n - 1 - i] - a[m - 1 - i] + '0';
			 }
			 else
			 {
				 p.argValue.charAt(n - 1 - i) = b[n - 1 - i] - a[m - 1 - i] + '0' + 10;
				 b[n - 2 - i]--;
			 }
		 }
		 p.argValue = p.argValue.substring(0, n);
	for (int i = 0;i < n - m;i++)
	{
				p.argValue.charAt(i) = b[i];
	}
		 if (p.argValue.charAt(0) == '0' && p.argValue.charAt(1) != 0)
		 {
					  for (int i = 0;i < n + 1;i++)
					  {
					  p.argValue.charAt(i) = p.argValue.charAt(i + 1);
					  }
		 }

	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		f(b, a, tempRef_c);
		c = tempRef_c.argValue;
		System.out.printf("%s\n",c);
		System.in.read();
		}
	}

}

