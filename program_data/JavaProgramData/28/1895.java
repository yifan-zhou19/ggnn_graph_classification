package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);

		int i;
		int j;
		int k;
		int l1;
		int n;
		int l2;
		s1 = new Scanner(System.in).nextLine();
		l1 = s1.length();
		 n = 0;


			for (i = 0;i < l1;i++)
			{
			  if ((s1.charAt(i) == ' ') && (n > 0))
			  {
				 System.out.printf("%d,",n);
				 n = 0;
			  }
			   else if (s1.charAt(i) != ' ')
			   {
				   n++;
			   }
			}
			System.out.printf("%d",n);

			 return 0;
	}

}
