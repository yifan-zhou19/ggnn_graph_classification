package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		int i;
		char t;
		int r;
		i = 0;
		while (m.charAt(i) != '\0')
		{
			if ((m.charAt(i) >= 'a') && (m.charAt(i) <= 'z'))
			{
			m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) - 32);
			}
			i++;
		}
		i = 0;
		while (m.charAt(i) != '\0')
		{
		   r = 0;
		   t = m.charAt(i);
		   while (t == m.charAt(i))
		   {
			 r++;
			 i++;
		   }

		   System.out.printf("(%c,%d)",t,r);
		}
		 return 0;
	}
}

