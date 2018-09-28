package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[100]);
	 String str1 = new String(new char[50]);
	 String str2 = new String(new char[50]);
	 char[][] zfc = new char[3][50];
		int i;
		int j;
		int yes;
		int no = 0;
		int m;
		int n;
		int len;
		int len1;
		int len2;
		str = new Scanner(System.in).nextLine();
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len = str.length();
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0;i < len - len1 + 1;i++)
		{
			yes = 0;
								for (j = 0;j < len1;j++)
								{
													if (str.charAt(i + j) == str1.charAt(j))
													{
													yes++;
													}
								}
													//printf("%d",yes);
								if (yes == len1)
								{

								m = i;

	   //printf("%d",m);
	   n = 0;
	   for (i = 0;i < m;i++)
	   {
						zfc[0][n] = str.charAt(i);
						n++;
	   }
						zfc[0][m] = '\0';
						System.out.printf("%s",zfc[0]);
	  zfc[1] = str2;
							 System.out.printf("%s",zfc[1]);
							 n = 0;
	  for (i = m + len1;i < len;i++)
	  {
							  zfc[2][n] = str.charAt(i);
							  n++;
	  }
							  zfc[2][len - m - len1] = '\0';
							  System.out.printf("%s",zfc[2]);
	 // printf("%s%s%s",zfc[0],zfc[1],zfc[2]);
	   break;
								}
	else
	{
		no++;
	}
		}
	if (no == len - len1 + 1)
	{
		 System.out.printf("%s",str);
	}
		 return 0;
	}
}
