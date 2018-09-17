package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  int i;
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
			if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
			int b = 0;
			while (a.charAt(i + 1) == a.charAt(i))
			{
			  b = 1 + b;
			  i = i + 1;
			}
			System.out.printf("(%c,%d)",a.charAt(i),b + 1);
		  }
	}



}

