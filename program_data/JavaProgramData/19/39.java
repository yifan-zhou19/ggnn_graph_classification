package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int isWords;
	   String s1 = new String(new char[100]);
	   String s2 = new String(new char[100]);
	   String s3 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		i = 0;
		j = 0;
		k = 0;
		String p;
		p = tangible.StringFunctions.strTok(s1,"' '");
					 if (strcmp(p,s2) == 0)
					 {
				   System.out.printf("%s",s3);
					 }
				 else
				 {
					 System.out.printf("%s",p);
				 }
				 p = tangible.StringFunctions.strTok(null,"' '");
		while (p != null)
		{
				 if (strcmp(p,s2) == 0)
				 {
					System.out.printf(" %s",s3);
				 }
				 else
				 {
					 System.out.printf(" %s",p);
				 }
				 p = tangible.StringFunctions.strTok(null,"' '");
		}
	 s1 = new Scanner(System.in).nextLine();
				return 0;
	}

}

