package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[MAX + 1]);
		int n;
		int i;
		int j;
		int len;
	str = new Scanner(System.in).nextLine();
	n = Integer.parseInt(str);
	  for (i = 0;i < n;i++)
	  {
		  str = new Scanner(System.in).nextLine();
	 len = str.length();
			   if ((str.charAt(len - 2) == 'e') && (str.charAt(len - 1) == 'r'))
			   {
						str = str.substring(0, len - 2);
			   }
		  else if ((str.charAt(len - 2) == 'l') && (str.charAt(len - 1) == 'y'))
		  {
						str = str.substring(0, len - 2);
		  }
		  else if ((str.charAt(len - 2) == 'n') && (str.charAt(len - 1) == 'g') && (str.charAt(len - 3) == 'i'))
		  {
						str = str.substring(0, len - 3);
		  }
		   System.out.println(str);

	  }

		return 0;
	}

}
