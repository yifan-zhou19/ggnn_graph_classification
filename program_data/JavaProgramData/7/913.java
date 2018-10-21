package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s3 = new String(new char[100]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int L1;
		int L2;
		int i;
		int j;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		L1 = s1.length();
		L2 = s2.length();
		for (i = 0;i < L1;i++)
		{
			if (s1.charAt(i) == s2.charAt(0) && s1.charAt(i + L2 - 1) == s2.charAt(L2 - 1))
			{
				for (j = i;j < i + L2;j++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, j, s3.charAt(j - i));
				}
								 break;
			}
		}
		System.out.println(s1);
		return 0;
	}



}

