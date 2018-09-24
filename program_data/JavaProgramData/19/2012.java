package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] word = new char[50][100];
		int i;
		int j;
		int num = 1;
		int[] count = new int[50];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= s.length();i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				count[num]++;
			}
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				for (j = 0;j < count[num];j++)
				{
					word[num][j] = s.charAt(i - count[num] + j);
				}
				word[num][count[num]] = '\0';

				if (s.charAt(i) == ' ')
				{
					num++;
				}
			}
		}
		for (i = 1;i <= num;i++)
		{
			if (strcmp(word[i],a) == 0)
			{
				word[i] = b;
			}
			else
			{
				continue;
			}
		}
		for (i = 1;i < num;i++)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s",word[num]);
	}


}
