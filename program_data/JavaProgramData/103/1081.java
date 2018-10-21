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
		  int i = 0;
		  int j = 0;
		  int k = 0;
		  int m;
		  while (a.charAt(i) != '\0')
		  {
				 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				 {
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
				 }
				 i++;
		  }
		  while (a.charAt(j) != '\0')
		  {
						   m = 1;
						   for (k = j;a.charAt(k) != '\0';k++)
						   {
												  if (a.charAt(k) == a.charAt(k + 1))
												  {
												  m = m + 1;
												  }
												  else
												  {
													  System.out.printf("(%c,%d)",a.charAt(k),m);
												  j = k + 1;
												  break;
												  }
						   }

		  }

		  System.out.print("\n");

	}
}

