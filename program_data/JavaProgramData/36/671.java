package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,t,s=1;
		int i;
		int j;
		int t;
		int s = 1;
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
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				t = 0;
				for (j = 0;j < b.length();j++)
				{
				if (a.charAt(i) == b.charAt(j))
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 1);
					t = 1;
					break;
				}
				}
				if (t == 0)
				{
					s = 0;
				}
			}

		if (s != 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}

}

