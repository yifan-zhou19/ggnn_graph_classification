package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String string1 = new String(new char[100]);
		 String string2 = new String(new char[100]);
		 string1 = new Scanner(System.in).nextLine();
		 int l = string1.length();
		 int i;
		 int j;
		 int count = 0;
		 for (i = 0;i < 100;i++)
		 {
			string2 = tangible.StringFunctions.changeCharacter(string2, i, '\0');
		 }
		 for (i = 0;i < l;i++)
		 {
			if (string1.charAt(i) != 32)
			{
			 string2 = tangible.StringFunctions.changeCharacter(string2, count, string1.charAt(i));
			 count++;
			}
			else
			{
			   string2 = tangible.StringFunctions.changeCharacter(string2, count, string1.charAt(i));
			   count++;
			   for (j = i + 1;string1.charAt(j) == 32;j++)
			   {
				   ;
			   }
			   i = j - 1;
			}
		 }
		 System.out.printf("%s",string2);
		 System.in.read();
		 System.in.read();
	}

}

