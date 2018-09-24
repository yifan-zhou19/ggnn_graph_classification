package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		char[][] str4 = new char[100][100];
		String p;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		p = str1;
		int i;
		int j = 0;
		int k = 0;
		int n;
		n = str1.length();
		for (i = 0;i <= n;i++)
		{
			if ((*(p.Substring(i)) != ' ') && (*(p.Substring(i)) != '\0'))
			{
				str4[k][j] = str1.charAt(i);
				j = j + 1;
			}
			else
			{
				str4[k][j] = '\0';
				j = 0;
				k = k + 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (strcmp(str4[i],str2) == 0)
			{

				str4[i] = str3;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
		System.out.printf("%s ",str4[i]);
		}
		System.out.printf("%s\n",str4[k - 1]);
	}
}
