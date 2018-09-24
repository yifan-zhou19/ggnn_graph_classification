package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_x = new String(new char[100000]);
	public static int Main()
	{
		int i;
		int t;
		int j;
		int k;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static char x[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= t;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 Main_x = tempVar2.charAt(0);
		 }
	   for (k = 0;Main_x.charAt(k) != '\0';k++)
	   {
			  for (j = 0;Main_x.charAt(j) != '\0';j++)
			  {
			  if (Main_x.charAt(k) == Main_x.charAt(j) && k != j)
			  {
				 break;
			  }
			  }
		   if (Main_x.charAt(j) == '\0')
		   {
				 System.out.printf("%c\n",Main_x.charAt(k));
			  break;
		   }
	   }
		if (Main_x.charAt(k) == '\0')
		{
			System.out.print("no\n");
		}
		for (j = 1;j < 100000;j++)
		{
			Main_x = tangible.StringFunctions.changeCharacter(Main_x, j, '\0');
		}
	}
	}
}

