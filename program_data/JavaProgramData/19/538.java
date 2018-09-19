package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = str.length();
		char[][] words =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		for (k = 0;k < n;k++)
		{
			if (str.charAt(k) != 32)
			{
				words[i][j] = str.charAt(k);
				j++;
			}
			else if (str.charAt(k) == 32)
			{
				i++;
				j = 0;
			}
		}
		m = i + 1;
		for (i = 0;i < m;i++)
		{
			if (strcmp(words[i],a) == 0)
			{
				words[i] = b;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%s ",words[i]);
		}
		System.out.printf("%s\n",words[m - 1]);
	}







}
