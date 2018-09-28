package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int d1;
		int d2;
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		char c;
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
	  d1 = str1.length();
	  d2 = str2.length();
	  if (d1 != d2)
	  {
		  System.out.print("NO");
	  }
	  else
	  {

		  for (i = 0;i < d1 - 1;i++)
		  {
		   for (j = i;j < d1;j++)
		   {
			   if (str1.charAt(j) < str1.charAt(i))
			   {
				   c = str1.charAt(i);
				   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(j));
				   str1 = tangible.StringFunctions.changeCharacter(str1, j, c);
			   }
		   }
		  }
		 for (i = 0;i < d2 - 1;i++)
		 {
		   for (j = i;j < d2;j++)
		   {
			   if (str2.charAt(j) < str2.charAt(i))
			   {
				   c = str2.charAt(i);
				   str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(j));
				   str2 = tangible.StringFunctions.changeCharacter(str2, j, c);
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

}

