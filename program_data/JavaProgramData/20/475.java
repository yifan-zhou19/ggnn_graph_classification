package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][10];
		char[][] substr = new char[100][3];
		char s;
		char[][] str1 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] str2 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
	 int j;
	 int i = 0;
	 int n;
	 int b;
	 int c;
	  while (scanf("%s %s",str[i],substr[i]) != EOF)
	  {
		n = String.valueOf(str[i]).length();
			s = str[i][0];
			for (j = 1;j < n;j++)
			{
		  if (str[i][j] > s)
		  {
		   s = str[i][j];
		   b = j;
		  }
			}
			for (c = 0,j = 0;c <= b;c++,j++)
			{
	   str1[i][c] = str[i][j];
			}
	   for (c = 0,j = b + 1;j < n;c++,j++)
	   {
		str2[i][c] = str[i][j];
	   }
	   str1[i] += substr[i];
	   str1[i] += str2[i];
	   System.out.printf("%s\n",str1[i]);
	   i++;
	  }
	}

}
