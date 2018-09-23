package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 final String a = "";
	 int i;
	 int j = 0;
	 int k;
	 for (i = 0;i < 100;i++)
	 {
	   j += scanf("%s",a.charAt(i));
	   if (a.charAt(i)[0] < 2)
	   {
		   break;
	   }
	 }
	 for (i = 0;i < 100;i++)
	 {
		 if (strcmp(a.charAt(i),a.charAt(j - 1)) == 0)
		 {
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
		 }
	 }
	 for (i = 0;i < j - 2;i++)
	 {
		 System.out.printf("%s ",a.charAt(i));
	 }
	 System.out.printf("%s",a.charAt(j - 2));
	 return 0;
	}

}

