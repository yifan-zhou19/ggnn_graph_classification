package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int j = 0;
		int i = 0;
		int n;
		int k;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		while (i < n)
		{
			if (s.charAt(i) != ' ')
			{
					j = j + 1;
				 i = i + 1;
			}
			else if (j != 0)
			{
						  System.out.printf("%d,",j);
				  k = j;
				  j = 0;
				  i++;
			}
				  else
				  {
					  i++;
				  }
		}
		System.out.printf("%d",j);
	}

}
