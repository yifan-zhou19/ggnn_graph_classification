package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s3 = new String(new char[100]);
		String s = new String(new char[100]);
		int a;
		int b;
		int c;
		int i;
		int n;
		int j;
		int k;
		int q = 1;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		a = s1.length();
		b = s2.length();
		c = s3.length();
		s = s1;
		for (i = 0;i < a;i++)
		{

			for (j = 0;j < b;j++)
			{
				if (s.charAt(i + j) != s2.charAt(j))
				{
				break;
				}
			}
			if ((j == b) && ((s.charAt(i - 1) == ' ') || (i == 0)))
			{

				for (k = i;k < i + c;k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s3.charAt(k - i));
				}
				for (k = i + c;k + (b - c) * q < a;k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, k, s1.charAt(k + (b - c) * q));
				}
				s = s.substring(0, a + (c - b) * q);

				q++;
			}
		}
		System.out.println(s);
	}
}

