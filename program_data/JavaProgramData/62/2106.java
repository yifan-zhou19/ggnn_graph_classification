package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[20000]);
	  char temp;
	  int i;
	  int j;
	  j = 0;
	  for (i = 0;i < 20000;i++) //???????
	  {
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  temp = tempVar.charAt(0);
		  }
		if (temp == a.charAt(j - 1) && a.charAt(j - 1) == 32)
		{
			;
		}
		else
		{
			  a = tangible.StringFunctions.changeCharacter(a, j, temp);
			  System.out.printf("%c", a.charAt(j));
			  j++;
		}
	  }

	  return 0;
	}
}

