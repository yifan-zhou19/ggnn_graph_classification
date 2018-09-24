package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String sub = new String(new char[1000]);
		String rep = new String(new char[1000]);
		int len1;
		int len2;
		int len3;
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		len1 = str.length();
		len2 = sub.length();
		len3 = rep.length();
	 for (j = 0;j < len2;j++)
	 {

	 for (i = 0;i < len1;i++)
	 {
		 if (str.charAt(i) != sub.charAt(0))
		 {
			 continue;
		 }

		 if (str.charAt(i) == sub.charAt(0) && str.charAt(i + 1) == sub.charAt(1) && str.charAt(i + 2) == sub.charAt(2) && str.charAt(i + 3) == sub.charAt(3))
		 {
			 break;
		 }
	 }
	 }
				if (i < len1)
				{
				 for (k = i;k < i + len2;k++)
				 {
						  str = tangible.StringFunctions.changeCharacter(str, k, rep.charAt(k - i));
				 }
				}


					  System.out.printf("%s",str);
					return 0;
	}

}

