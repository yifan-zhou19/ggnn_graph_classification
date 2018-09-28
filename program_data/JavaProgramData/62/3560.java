package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[201]);
	 String b = new String(new char[201]);
	 a = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int l = a.length();
	 for (i = 0,j = 0;i < l;i++,j++)
	 {
		 int k = 0;
		 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		 if (a.charAt(i) == ' ')
		 {

			for (int m = i + 1;m < l;m++)
			{
			 if (a.charAt(m) == ' ')
			 {
				 k++;
			 }
			 else
			 {
				 break;
			 }
			}
		 }
		 i = i + k;
	 }
	 b = b.substring(0, j);
	 System.out.println(b);

	 return 0;
	}


}

