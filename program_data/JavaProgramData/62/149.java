package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] word = new char[100][20];
		int i;
		int j;
		int k;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		j = 0;
		k = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				word[j][k] = s.charAt(i);
				k++;
			}
			else if ((s.charAt(i) == ' ') && (s.charAt(i - 1) != ' '))
			{
				word[j][k] = '\0';
				j++;
				k = 0;
			}
			else
			{
				continue;
			}
		}
		word[j][k] = '\0';
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s",word[i]);
		return 0;
	}


}
