package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[110]);
		char[][] ss = new char[110][100];
		String s2 = new String(new char[110]);
		String s3 = new String(new char[110]);
		String temp = new String(new char[110]);
		int i = 0;
		int j = 0;
		int k = 0;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		for (i = 0;s1.charAt(i) != '\0';i++)
		{
			if (s1.charAt(i) != ' ')
			{
				ss[j][k++] = s1.charAt(i);
			}
			else if (s1.charAt(i) == ' ')
			{
				ss[j][k] = '\0';
				j++;
				k = 0;
			}
		}

		for (int p = 0;p < j + 1;p++)
		{
			if (strcmp(ss[p],s2) == 0)
			{
				ss[p] = s3;
			}

		}
		for (int q = 0;q < j;q++)
		{
			System.out.printf("%s ",ss[q]);
		}
		System.out.printf("%s",ss[j]);

		//printf("%s\n",ss[p]);
		return 0;
	}

}
