package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int chang;
	   final String a = "";
	   final String b = "";
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   chang = a.length();
	   for (i = 0;i < chang;i++)
	   {
		   b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(chang - i - 1));
	   }
	   for (i = 0;i < chang;i++)
	   {
	   System.out.printf("%c",b.charAt(i));
	   }
	}
}

