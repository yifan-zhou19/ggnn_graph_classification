package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		String s = new String(new char[10000]);
		char[][] word = new char[100][100];
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		w1 = new Scanner(System.in).nextLine();
			 w2 = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
			word[j][k++] = s.charAt(i);
			}
			else
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
		if (strcmp(word[i],w1) == 0)
		{
			word[i] = w2;
		}
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s",word[j]);
	}
}
