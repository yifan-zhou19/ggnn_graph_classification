package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 1;
		String s1 = new String(new char[M]);
		String s2 = new String(new char[M]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int t1,t2,i,j,k;
		int t1;
		int t2;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		t1 = s1.length();
		t2 = s2.length();
		if (t1 != t2)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < t1;i++)
			{
				for (j = 0;j < s2.length();j++)
				{
				 if (s2.charAt(j) == s1.charAt(i))
				 {
					 for (k = j;k <= s2.length();k++)
					 {
						 s2 = tangible.StringFunctions.changeCharacter(s2, k, s2.charAt(k + 1));
					 }
				 }
				}

			}
			if (!s2.length())
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
			System.out.print("\n");
		}
		return 0;
	}

}

