package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		w1 = new Scanner(System.in).nextLine();
		w2 = new Scanner(System.in).nextLine();
		int i;
		int l = s.length();
		int l1 = w1.length();
		int l2 = w2.length();
		int p = 0;
		int m;
		int n;
		int j;
		int k;
		for (i = 0;i < l;i++)
		{
			   if (s.charAt(i) == w1.charAt(0) && (s.charAt(i - 1) == 32 || i == 0) && (s.charAt(i + l1) == 32 || i == l - 1))
			   {
					p = 1;
					for (m = i,n = 0;n < l1;m++,n++)
					{
					if (s.charAt(m) != w1.charAt(n))
					{
						p = 0;
						break;
					}
					}
			   }
			   if (p != 0)
			   {
				   for (k = 0;k < l2;k++)
				   {
				   System.out.printf("%c",w2.charAt(k));
				   }
				   i = i + l1 - 1;
				   p = 0;
			   }
			   else
			   {
				   System.out.printf("%c",s.charAt(i));
			   }
		}


		return 0;
	}

}
