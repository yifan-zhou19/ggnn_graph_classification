package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str1 = new char[100][100];
		char[][] str2 = new char[100][100];
		char[][] str3 = new char[100][100];
		char[][] s = new char[100][100];
		int n;
		int i;
		int j;
		int k;
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str3[i] = new Scanner(System.in).nextLine();
			str1[i] = new Scanner(System.in).nextLine();
			str2[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			a1[i] = String.valueOf(str1[i]).length();
			a2[i] = String.valueOf(str2[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			s[i][a1[i]] = '\0';
			for (j = a2[i] - 1;j >= 0;j--)
			{
			   if (str1[i][j + a1[i] - a2[i]] >= str2[i][j])
			   {
				   s[i][j + a1[i] - a2[i]] = str1[i][j + a1[i] - a2[i]] - str2[i][j] + 48;
			   }
			   else
			   {
				   s[i][j + a1[i] - a2[i]] = str1[i][j + a1[i] - a2[i]] - str2[i][j] + 58;
				  str1[i][j + a1[i] - a2[i] - 1] = str1[i][j + a1[i] - a2[i] - 1] - 1;
			   }
			}
			for (k = 0;k < a1[i] - a2[i];k++)
			{
				s[i][k] = str1[i][k];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
	}







}

