package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		int count = 1;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.charAt(j) != '\0')
		{
		 if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 32);
		 }
		 j++;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		if (a.charAt(i) == a.charAt(i + 1))
		{
		  count += 1;
		}
		  else
		  {
			  System.out.printf("(%c,%d)",a.charAt(i),count);
			  count = 1;
			  continue;
		  }
		}
	}

}

