package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[50]);
		String string2 = new String(new char[50]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 string1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 string2 = tempVar2.charAt(0);
	 }
	 int i;
	 int j;
	 int k;
	 int len1;
	 int len2;
	 char t;
	 len1 = string1.length();
	 len2 = string2.length();
	 for (i = 0;i < len1 - 1;i++)
	 {
			k = i;
		 for (j = i + 1;j < len1;j++)
		 {
			 if (string1.charAt(j) > string1.charAt(k))
			 {
				 k = j;
			 }
		 }
		 if (k != i)
		 {
			 t = string1.charAt(i);
			 string1 = tangible.StringFunctions.changeCharacter(string1, i, string1.charAt(k));
			 string1 = tangible.StringFunctions.changeCharacter(string1, k, t);
		 }
	 }
	 for (i = 0;i < len2 - 1;i++)
	 {
			k = i;
		 for (j = i + 1;j < len2;j++)
		 {
			 if (string2.charAt(j) > string2.charAt(k))
			 {
				 k = j;
			 }
		 }
		 if (k != i)
		 {
			 t = string2.charAt(i);
			 string2 = tangible.StringFunctions.changeCharacter(string2, i, string2.charAt(k));
			 string2 = tangible.StringFunctions.changeCharacter(string2, k, t);
		 }
	 }
	 if (strcmp(string1,string2) == 0)
	 {
		 System.out.print("YES");
	 }
	 else
	 {
		 System.out.print("NO");
	 }
	}

}

