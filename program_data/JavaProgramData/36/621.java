package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int p;
	 int q;

	 String str1 = new String(new char[100]);
	 String str2 = new String(new char[100]);
	 char temp;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 str2 = tempVar2.charAt(0);
	 }
	 m = str1.length();
	 for (i = 0;i < m - 1;i++)
	 {
		 for (j = 0;j < m - 1 - i;j++)
		 {
			 if (str1.charAt(j) > str1.charAt(j + 1))
			 {
					temp = str1.charAt(j);
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j + 1));
					str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, temp);
			 }
		 }
	 }

	n = str2.length();
	for (p = 0;p < n - 1;p++)
	{
	   for (q = 0;q < n - 1 - p;q++)
	   {
		   if (str2.charAt(q) > str2.charAt(q + 1))
		   {
			temp = str2.charAt(q);
			str2 = tangible.StringFunctions.changeCharacter(str2, q, str2.charAt(q + 1));
			str2 = tangible.StringFunctions.changeCharacter(str2, q + 1, temp);
		   }
	   }
	}

	 if (strcmp(str1,str2) == 0)
	 {
		 System.out.print("YES");
	 }
	 else
	 {
		 System.out.print("NO");
	 }
	}

}

