package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	   String substr = new String(new char[4]);
	   char[][] str1 =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	   };
	   int i;
	   int k;
	   int j;
	   int m = 0;
	  while (scanf("%s%s",str,substr) != EOF)
	  {
		  k = 0;
	   for (i = 1;i < str.length();i++)
	   {
		if (str[i] > str[k])
		{
			k = i;
		}
	   }
		for (i = str.length() + 2;i > k + 3;i--)
		{
		   str1[m][i] = str[i - 3];
		}
		for (i = 0;i <= k;i++)
		{
		  str1[m][i] = str[i];
		}
			  j = 0;
		for (i = k + 1;i < k + 4;i++,j++)
		{
		  str1[m][i] = substr.charAt(j);
		}
		 m++;
	  }
	   for (i = 0;i < m;i++)
	   {
	   System.out.printf("%s\n",str1[i]);
	   }
	return 0;
	}

}
