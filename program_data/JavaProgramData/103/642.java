package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int i;
		  String str = new String(new char[1001]);
		  a = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  for (i = 0;;i++)
		  {
					   if (str.charAt(i) == '\0')
					   {
					   break;
					   }
					   if (str.charAt(i) > 96)
					   {
					   str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
					   }
		  }
		  for (i = 0;;i++)
		  {

					   if (str.charAt(i) == str.charAt(i + 1))
					   {
					   a++;
					   }
					   else
					   {
					   System.out.printf("(%c,%d)",str.charAt(i),a);
					   a = 1;
					   }
					   if (str.charAt(i + 1) == '\0')
					   {
					   break;
					   }

		  }

	}

}

