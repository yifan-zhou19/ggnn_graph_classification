package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[100][15];
		String t = new String(new char[150]);
		int i;
		int j = 0;
		int k = 0;
		int m;
		t = new Scanner(System.in).nextLine();
		s[0][0] = t.charAt(0);
		for (i = 1;i < t.length();i++)
		{
			if (t.charAt(i) != ' ' && t.charAt(i - 1) == ' ')
			{
				k = 0;
				j++;
				s[j][k] = t.charAt(i);
			}
			if (t.charAt(i) != ' ' && t.charAt(i - 1) != ' ')
			{
				k++;
				s[j][k] = t.charAt(i);
			}
			if (t.charAt(i) == ' ')
			{
				s[j][k + 1] = '\0';
			}
		}
		s[j][k + 1] = '\0';

		m = j;
		for (m = j;m >= 1;m--)
		{
			System.out.printf("%s ",s[m]);
		}
		System.out.printf("%s",s[0]);
	}
}
