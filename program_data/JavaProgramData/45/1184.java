package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		int j;
		int m;
		int k;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ')
			{
			m = i;
			}
		}
		for (j = m + 1;j < 100;j++)
		{
			 if (s.charAt(j) == s.charAt(0))
			 {
					 for (k = 1;k < m;k++)
					 {
						 if (s.charAt(j + k) != s.charAt(k))
						 {
							  break;
						 }
					 }
			 }
				   if (k == m)
				   {
					   System.out.printf("%d",j - m - 1);
					   break;
				   }
		}
					return 0;
	}


}
