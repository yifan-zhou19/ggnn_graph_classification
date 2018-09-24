package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int k = 1;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		  if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
		  {
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
		  }
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		  if (a.charAt(i) == a.charAt(i + 1))
		  {
			k = k + 1;
			continue;
		  }
		  else
		  {
			System.out.printf("(%c,%d)",a.charAt(i),k);
			k = 1;
		  }
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

