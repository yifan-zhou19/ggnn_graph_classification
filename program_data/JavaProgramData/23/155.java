package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[][] t = new char[100][100];
		int i = 0;
		int j = 0;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != ' ')
			{
				t[j][k] = s.charAt(i);
				k++;
				i++;
			}
			else
			{
				j++;
				k = 0;
				i++;
			}
		}
		for (i = j;i > 0;i--)
		{
		System.out.printf("%s ",t[i]);
		}
		System.out.printf("%s",t[0]);
	}
}
