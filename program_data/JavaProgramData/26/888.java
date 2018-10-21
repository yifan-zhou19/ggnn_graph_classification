package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		 int i;
		 int n;
		str = new Scanner(System.in).nextLine();

		n = str.length();
		 for (i = 0;i < n;i++)
		 {
						if ((str.charAt(i)) != ' ')
						{
									System.out.printf("%c",str.charAt(i));
						}
						else if ((str.charAt(i)) == ' ')
						{
							 if ((str.charAt(i + 1)) == ' ')
							 {
							 continue;
							 }
							 else if ((str.charAt(i + 1)) != ' ')
							 {
								  System.out.printf("%c",str.charAt(i));
							 }
						}

		 }


	   return 0;
	}


}
