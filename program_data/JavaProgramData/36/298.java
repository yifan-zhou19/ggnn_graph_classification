package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[5]);
		char[][] s = new char[1000][1000];
		char c;
		int n;
		int i;
		int j;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		if (n % 2 == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			if (str.charAt((n - 1) / 2) != ' ')
			{
				System.out.print("NO\n");
			}
			else
			{
				for (i = 0;i < 2;i++)
				{
					for (j = 0;str.charAt(k) != ' ';j++)
					{
						if (str.charAt(k) != '\0')
						{
							s[i][j] = str.charAt(k);
							k++;
						}
						else
						{
							break;
						}
					}
					s[i][j] = '\0';
					if (str[k] = '\0')
					{
						break;
					}
					k++;
				}
			}
			 for (i = 0;i < 2;i++)
			 {
				 for (k = 0;k < (n - 3) / 2;k++)
				 {
				 for (j = 0;j < (n - 3) / 2 - k;j++)
				 {
					 if (s[i][j] > s[i][j + 1])
					 {
						 c = s[i][j];
						 s[i][j] = s[i][j + 1];
						 s[i][j + 1] = c;
					 }
				 }
				 }
			 }
			 if (strcmp(s[0],s[1]) == 0)
			 {
				 System.out.print("YES\n");
			 }
			 else
			 {
				 System.out.print("NO\n");
			 }
		}
	}




}
