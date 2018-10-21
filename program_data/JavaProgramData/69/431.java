package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String c = new String(new char[260]);
		int t;
		int i;
		int j;
		int n;
		int m;
		int ca;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			m = a.length();
			n = b.length();
			if (m < n)
			{
			   c = a;
			   a = b;
			   b = c;
			   i = m;
			   m = n;
			   n = i;
			}
			   for (i = 0;i < m;i++)
			   {
				  a.charAt(i) -= '0';
			   }
			   for (i = 0;i < n;i++)
			   {
				  b.charAt(i) -= '0';
			   }
			   j = m - 1;
			   for (i = n - 1;i >= 0;i--,j--)
			   {
				   a.charAt(j) += b.charAt(i);
			   }
			   for (i = m - 1;i > 0;i--)
			   {
				  if (a.charAt(i) >= 10)
				  {
					 a.charAt(i - 1)++;
					 a.charAt(i) -= 10;
				  }
			   }
				  for (i = 0;i < m;i++)
				  {
						if (a.charAt(i) != 0)
						{
							break;
						}
				  }
					 int q = i;
					 if (q == m)
					 {
					 System.out.print("0");
					 }
					 else
					 {
					 for (i = q;i < m;i++)
					 {
					 System.out.printf("%d",a.charAt(i));
					 }
					 }
				  System.out.print("\n");
	}

}

