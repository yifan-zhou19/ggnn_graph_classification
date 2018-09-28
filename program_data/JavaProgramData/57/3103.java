package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int i;
		int j;
		String s = new String(new char[20]);
		String t = new String(new char[3]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			t = tangible.StringFunctions.changeCharacter(t, 0, s.charAt(len - 3));
			t = tangible.StringFunctions.changeCharacter(t, 1, s.charAt(len - 2));
			t = tangible.StringFunctions.changeCharacter(t, 2, s.charAt(len - 1));
			if (t.charAt(0) == 'i')
			{
			for (j = 0;j < len - 3;j++)
			{
					System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
			}
			else
			{
			  for (j = 0;j < len - 2;j++)
			  {
					System.out.printf("%c",s.charAt(j));
			  }
			  System.out.print("\n");
			}
		}
	}
}

