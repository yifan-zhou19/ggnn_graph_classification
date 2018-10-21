package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i = 0;
	   int j;
	   String a = new String(new char[5]);
	   while (true)
	   {
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		   }
		   if (a.charAt(i) == '\n')
		   {
			   break;
		   }
		   i = i + 1;
	   }
	   for (j = (i - 1);j >= 0;j--)
	   {
		   System.out.printf("%c",a.charAt(j));
	   }

	}
}

