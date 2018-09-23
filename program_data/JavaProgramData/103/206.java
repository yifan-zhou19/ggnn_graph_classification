package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int count;
		  i >= 0;
		  i <= 1000;
		  String a = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  count = 1;
		  for (i = 0;i <= 1000;i++)
		  {
							  if (a.charAt(i) > 'Z')
							  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
							  }
		  else
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i));
		  }
		  }
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
				if (a.charAt(i + 1) == a.charAt(i))
				{
								count = count + 1;
				}
				else
				{
					System.out.printf("(%c,%d)",a.charAt(i),count);
					count = 1;
				}
		  }
		  System.in.read();
	}

}

