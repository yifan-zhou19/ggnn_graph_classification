package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int flag;
		int len;
		String s = new String(new char[100]);
		String temp = new String(new char[100]);

		s = new Scanner(System.in).nextLine();
		flag = s.length();

		for (i = s.length() - 1;i >= 0;i--)
		{
		 if (s.charAt(i) == ' ')
		 {
		  len = flag - i;
		  for (j = i + 1;j < flag;j++)
		  {
		  System.out.printf("%c",s.charAt(j));
		  }
		  System.out.print(" ");
		  flag = i;
		 }
		}
		for (j = 0;j < flag;j++)
		{
		System.out.printf("%c",s.charAt(j));
		}
	}

}
