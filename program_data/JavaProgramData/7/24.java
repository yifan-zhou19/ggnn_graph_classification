package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int p;
	 String s = new String(new char[100]);
	 String c = new String(new char[100]);
	 String a = new String(new char[100]);
	 s = new Scanner(System.in).nextLine();
	 c = new Scanner(System.in).nextLine();
	 a = new Scanner(System.in).nextLine();
	 k = s.length();
	 p = c.length();
	 for (i = 0;i < k;i++)
	 {
		 j = 0;
		 for (j = 0;j < p;j++,i++)
		 {
			 if (s.charAt(i) != c.charAt(j))
			 {
			 break;
			 }
		 }
		 if (j > p - 1)
		 {
		  for (j = 0;j < p;j++,i++)
		  {
		  s = tangible.StringFunctions.changeCharacter(s, i - p, a.charAt(j));
		  }
		  break;
		 }
	 }
		 for (i = 0;i < k;i++)
		 {
			 System.out.printf("%c",s.charAt(i));
		 }
	}

}

