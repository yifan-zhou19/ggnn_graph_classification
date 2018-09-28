package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int l;
		int i;
		int j;
		int m;
		int p;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 2;i <= l;i++)
		{
		   for (j = 0;j <= l - i;j++)
		   {
			  p = 1;
			  m = j;
			  n = m + i - 1;
			  while (m >= 0)
			  {
				if (a.charAt(m) != a.charAt(n))
				{
				   p = 0;
				   break;
				}
				   if (m == n || n - m == 1)
				   {
				   break;
				   }
				   m++;
				   n--;
			  }
			 if (p == 1)
			 {
					 for (k = j;k <= j + i - 1;k++) //????j???m
					 {
					 System.out.printf("%c",a.charAt(k));
					 }
					 System.out.print("\n");
			 }
		   }
		}
			System.in.read();
			System.in.read();
	}

}

