package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[256]);
		String s = new String(new char[256]);
		String ti = new String(new char[256]);
		w = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		ti = new Scanner(System.in).nextLine();
		int len1;
		int len2;
		int len;
		len = w.length();
		len1 = s.length();
		len2 = ti.length();
		int i;
		int k;
		int n = 0;
		int m = 0;
		for (i = 0;i < len;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (k = 1;k < len1;k++)
				{
					if (w.charAt(i + k) == s.charAt(k))
					{
						n++;
					}
				}
				if (n == len1 - 1)
				{
					m = i;
				}
			}
		}
		if (m == 0)
		{
			System.out.println(w);
		}
		else
		{
		   for (i = 0;i < m;i++)
		   {
			   System.out.printf("%c",w.charAt(i));
		   }
		   for (i = 0;i < len2;i++)
		   {
				System.out.printf("%c",ti.charAt(i));
		   }
		   for (i = m + len1;i < len;i++)
		   {
				System.out.printf("%c",w.charAt(i));
		   }
		}
	return 0;
	}


}
