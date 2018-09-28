package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n = 0;
		int k = 0;
		String s = new String(new char[101]);
		char[][] s2 = new char[101][101];
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != ' ')
			{
				s2[n][k] = s.charAt(i);
				k++;
				i++;
			}
			else
			{
				s2[n][k] = '\0';
				k = 0;
				n++;
				i++;
			}
		}
		s2[n][k] = '\0';
		for (i = n;i > 0;i--)
		{
			System.out.printf("%s ",s2[i]);
		}
		System.out.printf("%s",s2[0]);
	}
}
