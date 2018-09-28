package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][100];
		String str1 = new String(new char[100]);
		int i = 0;
		str1 = new Scanner(System.in).nextLine();
		int b = 0;
		int p = str1.length();
		for (;i < p;i++)
		{
			if (str1.charAt(i) == ' ')
			{
				b = b + 1;
			}
		}
		b = b + 1;
		int j = 0;
		int k = 0;
		for (i = 0;i < p;i++)
		{

			if (str1.charAt(i) != ' ')
			{
				str[j][k] = str1.charAt(i);
				k++;
			}
			if (str1.charAt(i) == ' ')
			{
				str[j][k] = '\0';
				j = j + 1;
				k = 0;
			}

		}
		str[j][k] = '\0';

		for (;j >= 1;j--)
		{
			for (k = 0;;k++)
			{
				if (str[j][k] != '\0')
				{
					System.out.printf("%c",str[j][k]);
				}
				if (str[j][k] == '\0')
				{
					break;
				}
			}
			System.out.print(" ");
		}
		for (;j >= 0;j--)
		{
			for (k = 0;;k++)
			{
				if (str[j][k] != '\0')
				{
					System.out.printf("%c",str[j][k]);
				}
				if (str[j][k] == '\0')
				{
					break;
				}
			}
		}
	}
}
