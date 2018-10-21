package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[30]);
		String s;
		a = new Scanner(System.in).nextLine();
		s = a;
		n = a.length();
		  for (i = 0;i < n;i++)
		  {
			  if (*(s.Substring(i)) >= '0' && *(s.Substring(i)) <= '9')
			  {
				  j = 0;
				  System.out.printf("%c",*(s.Substring(i)));
			  }
			  else
			  {
				  if (j == 0)
				  {
					  System.out.print("\n");
		  continue;
				  }
				  else
				  {
					  continue;
				  }
			  }
		  }
	 return 0;
	}
}
