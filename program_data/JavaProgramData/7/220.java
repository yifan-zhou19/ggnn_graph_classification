package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[257]);
		String substr = new String(new char[257]);
		String re = new String(new char[257]);
		int i = 0;
		int j = 0;
		int n = 0;
		int m = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		n = substr.length();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == substr.charAt(j))
			{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcmp' has no equivalent in Java:
				if (memcmp(substr,str.Substring(i),n) == 0)
				{
					m = i;
					k = 1;
					break;
				}
			}
		}
		if (k == 1)
		{
		  for (i = m;i < m + n;i++)
		  {
			str = tangible.StringFunctions.changeCharacter(str, i, re.charAt(i - m));
		  }
		}

		System.out.printf("%s",str);
		return 0;
	}

}

