package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][100];
		String c = new String(new char[101]);
		String word1 = new String(new char[100]);
		String replaceword = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		word1 = new Scanner(System.in).nextLine();
		replaceword = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) != ' ')
			{
				str[j][k] = c.charAt(i);
				k++;
			}
			else
			{
				str[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		str[j][k] = '\0';
		for (i = 0;i <= j;i++)
		{
			if (strcmp(str[i],word1) == 0)
			{
				str[i] = replaceword;
			}
		}
		System.out.printf("%s",str[0]);
		for (i = 1;i <= j;i++)
		{
		   System.out.printf(" %s",str[i]);
		}
		System.out.print("\n");
	}




}
