package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		String str1 = new String(new char[100]);
		char[][] str2 = new char[100][100];
		str1 = new Scanner(System.in).nextLine();
		for (i = 0,k = -1;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				k = k + 1;
				str2[i][j] = str1.charAt(k);
				if (str1.charAt(k) == ' ' || str1.charAt(k) == '\0')
				{
					break;
				}
			}
			if (str1.charAt(k) == '\0')
			{
				break;
			}
		}
	   for (i;i >= 0;i--)
	   {
		   for (j = 0;str2[i][j] != ' ' && str2[i][j] != '\0';j++)
		   {
			   System.out.printf("%c",str2[i][j]);
		   }
		   if (str2[i][j] = ' ' && i != 0)
		   {
			   System.out.print(" ");
		   }
	   }
	}

}
