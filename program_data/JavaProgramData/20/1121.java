package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int mark;
		 int n;
		 int m;
		 int k;
		 String str = new String(new char[13]);
		 String substr = new String(new char[13]);
		 String a = new String(new char[26]);
		 while (scanf("%s %s",str,substr) != EOF)
		 {
			   n = str.length();
			   m = substr.length();
			   mark = 0;
			   for (i = 0;i < n;i++)
			   {
				   if (str.charAt(i) > str.charAt(mark))
				   {
					   mark = i;
				   }
			   }
			   for (i = 0;i < mark + 1;i++)
			   {
				   a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
			   }
			   for (;i < mark + m + 1;i++)
			   {
				   a = tangible.StringFunctions.changeCharacter(a, i, substr.charAt(i - mark - 1));
			   }
			   for (;i < n + m;i++)
			   {
				   a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i - m));
			   }
			   a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			   System.out.printf("%s\n",a);
		 }
	}

}

