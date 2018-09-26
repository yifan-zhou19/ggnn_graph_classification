package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
				String w = new String(new char[MAX + 1]);
			String s = new String(new char[4]);
			String a = new String(new char[3]);
		for (i = 0;i < n;i++)
		{
			int k = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			for (j = w.length() - 3;j <= w.length();j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, k, w.charAt(j));
				k++;
			}
			k = 0;
			 for (j = w.length() - 2;j <= w.length();j++)
			 {
				 a = tangible.StringFunctions.changeCharacter(a, k, w.charAt(j));
				 k++;
			 }
			 if (strcmp(a,"er") == 0 || strcmp(a,"ly") == 0)
			 {
				 t = 2;
			 }
			 if (strcmp(s,"ing") == 0)
			 {
				 t = 3;
			 }
			 for (j = 0;j < w.length() - t;j++)
			 {
			 System.out.printf("%c",w.charAt(j));
			 }
			 System.out.print("\n");
		}
		return 0;
	}

}

