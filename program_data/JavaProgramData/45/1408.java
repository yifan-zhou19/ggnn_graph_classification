package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[51]);
		String w = new String(new char[51]);
		char[][] zfc = new char[2][51];
		int i = 0;
		int j = 0;
		int n = 0;
		int m = 0;
		int k = 0;
		for (k = 0;k < 2;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				zfc[k] = tempVar.charAt(0);
			}
		}
		s = zfc[0];
		w = zfc[1];
		n = s.length();
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (w.charAt(i) == s.charAt(j))
			{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcmp' has no equivalent in Java:
				if (memcmp(s,w.Substring(i),n) == 0)
				{
					m = i;
					break;
				}
			}
		}
		System.out.printf("%d",m);
		return 0;
	}

}

