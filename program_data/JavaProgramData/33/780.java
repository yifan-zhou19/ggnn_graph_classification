package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String b = new String(new char[256]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			k = 0;
			for (ps = a; * ps != '\0';ps++)
			{
				if (*ps == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, k, 'T');
				}
				else if (*ps == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, k, 'A');
				}
				else if (*ps == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, k, 'G');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, k, 'C');
				}
				k++;
			}
			b = tangible.StringFunctions.changeCharacter(b, k, '\0');
			System.out.printf("%s\n",b);
		}
		return 0;
	}
}

