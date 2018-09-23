package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		String str = new String(new char[101]);
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		char[][] str3 = new char[101][101];
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				str3[k][j] = str.charAt(i);
				j++;
			}
			else
			{
				str3[k][j] = '\0';
				k++;
				j = 0;
			}
		}
		str3[k][j] = '\0';
		for (i = 0;i <= k;i++)
		{
			if (strcmp(str3[i],str1) == 0)
			{
				if (i == 0)
				{
					System.out.printf("%s",str2);
				}
			else
			{
				System.out.printf(" %s",str2);
			}
			}
			else
			{
				if (i == 0)
				{
					System.out.printf("%s",str3[i]);
				}
			else
			{
				System.out.printf(" %s",str3[i]);
			}
			}
		}
	}
}
