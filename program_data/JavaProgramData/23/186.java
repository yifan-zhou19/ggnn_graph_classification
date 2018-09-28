package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int m = 0;
		char[][] s = new char[20][100];
		for (i = 0;str.charAt(i) != '\0';)
		{
			for (j = 0;str.charAt(i + j) != ' ';)
			{
				s[m][j] = str.charAt(i + j);
				j++;
			}
			s[m][j] = '\0';
			i = i + j + 1;
			j = 0;
			m++;
		}
	   k = m - 2;
	   for (k = m - 2;k > 0;k--)
	   {
		   System.out.printf("%s ",s[k]);
	   }
	   System.out.printf("%s\n",s[0]);
	}




}
