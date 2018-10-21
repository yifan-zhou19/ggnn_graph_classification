package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n1;
		int n2;
		String s1 = new String(new char[257]);
		String s2 = new String(new char[257]);
		String s3 = new String(new char[257]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		n1 = s1.length();
		n2 = s2.length();
		for (i = 0;i < n1;i++)
		{
			if (s1.charAt(i) == s2.charAt(0))
			{
				j = 0;
				while (s1.charAt(i + j) == s2.charAt(j) && j < n2)
				{
					j++;
				}
				if (j == n2)
				{
					for (k = i;k < i + n2;k++)
					{
						s1 = tangible.StringFunctions.changeCharacter(s1, k, s3.charAt(k - i));
					}
					break;
				}
			}
		}
			for (i = 0;i < n1;i++)
			{
			System.out.printf("%c",s1.charAt(i));
			}
			return 0;
	}
}

