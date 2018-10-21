package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		String c = new String(new char[51]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Character.SIZE / Byte.SIZE));
		int i;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < b.length();i++)
		{
			c = b.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, a.length(), '\0');
			if (strcmp(a, c) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

