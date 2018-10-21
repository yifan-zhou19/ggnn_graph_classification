package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[250]);
		String str2 = new String(new char[250]);
		String str3 = new String(new char[251]);
	  int X;
	  int i;
	  int X1;
	  int X2;
	  int[] a = new int[250];
	  int[] b = new int[250];
	  int[] c = new int[250];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead("\n");
	 if (tempVar2 != null)
	 {
		 str2 = tempVar2.charAt(0);
	 }
	 X1 = str1.length();
	 X2 = str2.length();
	 X = X1;
	 if (X2 > X)
	 {
	 X = X2;
	 }
	 for (i = 0;i < X1;i++)
	 {
	 a[X1 - 1 - i] = str1.charAt(i) - '0';
	 }
	 for (i = 0;i < X2;i++)
	 {
	 b[X2 - 1 - i] = str2.charAt(i) - '0';
	 }
		for (i = 0;i <= X;i++)
		{
									  c[i] = a[i] + b[i];
									  c[i] = c[i] % 10;
								   if (i != 0)
								   {
								   if ((a[i - 1] + b[i - 1] == 9) && (c[i - 1] == 0))
								   {
									c[i] = c[i] + 1;
								   }
									  c[i] = c[i] % 10;
								   if ((a[i - 1] + b[i - 1]) >= 10)
								   {
									c[i] = c[i] + 1;
								   }
									  c[i] = c[i] % 10;
								   }

		}
		 if (c[X] == 0)
		 {
			for (i = 0;i < X;i++)
			{
			 str3 = tangible.StringFunctions.changeCharacter(str3, X - 1 - i, c[i] + '0');
			}

		 str3 = tangible.StringFunctions.changeCharacter(str3, X, '\0');
		 for (;;)
		 {
			 if (str3.charAt(1) == '\0')
			 {
			 break;
			 }
			 if (str3.charAt(0) != '0')
			 {
			 break;
			 }
			 if (str3.charAt(0) == '0')
			 {
			 for (i = 0;i < X;i++)
			 {
				 str3 = tangible.StringFunctions.changeCharacter(str3, i, str3.charAt(i + 1));
			 }
			 }

		 }
		 System.out.printf("%s",str3);
		 }
		 if (c[X] == 1)
		 {
			for (i = 0;i <= X;i++)
			{
			 str3 = tangible.StringFunctions.changeCharacter(str3, X - i, c[i] + '0');
			}
			 str3 = tangible.StringFunctions.changeCharacter(str3, X + 1, '\0');
			   for (;;)
			   {
			   if (str3.charAt(1) == '\0')
			   {
				 break;
			   }
			 if (str3.charAt(0) != '0')
			 {
				 break;
			 }
			 if (str3.charAt(0) == '0')
			 {
			   for (i = 0;i < X;i++)

			   {
				   str3 = tangible.StringFunctions.changeCharacter(str3, i, str3.charAt(i + 1));
			   }
			 }

			   }
		 System.out.printf("%s",str3);
		 }
	}

}

