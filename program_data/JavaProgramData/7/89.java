package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		int i;
		int n;
		int f;
		int t;
		int j;
		int k;
		int m;
		int l;
		int p;
		int q = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p = s.length();
		m = a.length();
		n = b.length();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		   if (s.charAt(i) == a.charAt(0))
		   {
		   f = 0;
			  for (j = 0;j < m;j++)
			  {
				 if (s.charAt(j + i) != a.charAt(j))
				 {
					 f = 1;
				 }
			  }
			  if (f == 0)
			  {
			  t = i;
			  if (t != 0)
			  {
				 for (k = 0;k < t;k++)
				 {
					System.out.printf("%c",s.charAt(k));
					q = 1;
				 }
			  }
			  for (l = 0;l < n;l++)
			  {
				 System.out.printf("%c",b.charAt(l));
			  }
			  if (s.charAt(m + t) != '\0')
			  {
				 for (k = m + t;k < p;k++)
				 {
					System.out.printf("%c",s.charAt(k));
				 }
					System.out.print('\0');
					q = 1;
			  }
			  if (q == 1)
			  {
				  break;
			  }
			  }
		   if (q == 1)
		   {
			   break;
		   }
		   }
		   if (q == 1)
		   {
			   break;
		   }
		}
		   if (q == 0)
		   {
			   System.out.printf("%s",s);
		   }
		return 0;
	}

}
