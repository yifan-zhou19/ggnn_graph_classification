package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s3 = new String(new char[100]);
		char[][] copy = new char[100][100];
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();

		int i;
		int j;
		int k;
		j = k = 0;
		for (i = 0;i < s1.length();i++)
		{
			copy[j][k] = s1.charAt(i);
			if (s1.charAt(i + 1) == ' ' || s1.charAt(i + 1) == '\0')
			{
				copy[j][k + 1] = '\0';
				k = 0;
				j++;
				i++;
				continue;
			}
			k++;
		}

		for (k = 0;k < j;k++)
		{
			if ((strcmp(copy[k],s2)) == 0)
			{
				copy[k] = s3;
			}
		}
		System.out.printf("%s",copy[0]);
		for (k = 1;k < j;k++)
		{
			System.out.printf(" %s",copy[k]);
		}

		return 0;
	}


}
