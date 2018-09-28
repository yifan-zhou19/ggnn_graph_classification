package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[105]);
		char[][] t = new char[100][100];
		int i;
		int j;
		int k;

		s = new Scanner(System.in).nextLine();

		j = 0;
		k = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				t[j][k] = s.charAt(i);
				k++;
			}

			if (s.charAt(i) == ' ')
			{
				t[j][k] = 0;
				k = 0;
				j++;
			}
		}
		t[j][k] = 0;


	//	printf("%s",t[0]);
	//	getchar();

		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",t[i]);
		}
		System.out.printf("%s\n",t[0]);
	}
}
