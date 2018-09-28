package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = s.length() + 1;
		String n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		n = (String)malloc((Character.SIZE / Byte.SIZE) * m);

		for (i = 0;i < w.length();i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (k = 0,j = i;j - i < s.length();j++,k++)
				{
					n = tangible.StringFunctions.changeCharacter(n, k, w.charAt(j));
				}

				int result = strcmp(n,s);
				if (result == 0)
				{
					System.out.printf("%d\n",i);
				break;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(n);

		return 0;

	}



}

