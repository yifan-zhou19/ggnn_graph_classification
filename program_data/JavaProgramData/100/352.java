package <missing>;

public class GlobalMembers
{
	public static void min(String str)
	{
		final String str1 = "";
		final String str2 = "";
		char m;
		int b;
		int i;
		int j;
		int t;
		int k = 0;
		int n = 0;
		int p;
		b = str.length();
		for (i = 0;i < b;i++)
		{
			if (str[i].compareTo('a') < 0 || str[i].compareTo('z') > 0)
			{
		str[i] = '0';
			}
		}
		for (i = 0;i < b;i++)
		{
			if (str[i].equals('0'))
			{
				n++;
			}
		}
			if (n != b)
			{
	   for (i = 0;i < b;i++)
	   {
			t = 1;
			if (!str[i].equals('0'))
			{
				for (j = 1,t = 0;j < b - i;j++)
				{
					if (str[i].equals(str[i + j]))
					{
						str[i + j] = '0';
						t++;
					}
				}
				str1 = tangible.StringFunctions.changeCharacter(str1, k, t + 1);
				k++;
			}
	   }
	  for (i = 0,j = 0;i < b;i++)
	  {
			if (!str[i].equals('0'))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, str[i]);
				j++;
			}
	  }
	  for (i = 0;i < j;i++)
	  {
		  for (k = 0;k < j - i;k++)
		  {
			  if (str2.charAt(k) < str2.charAt(k + 1))
			  {
			  m = str2.charAt(k);
			  str2 = tangible.StringFunctions.changeCharacter(str2, k, str2.charAt(k + 1));
			  str2 = tangible.StringFunctions.changeCharacter(str2, k + 1, m);
				 p = str1.charAt(k);
			  str1 = tangible.StringFunctions.changeCharacter(str1, k, str1.charAt(k + 1));
			  str1 = tangible.StringFunctions.changeCharacter(str1, k + 1, p);

			  }
		  }
	  }
	   for (i = 0;i < j;i++)
	   {
		   System.out.printf("%c=%d\n",str2.charAt(j - 1 - i),str1.charAt(j - i - 1));
	   }
			}
			else
			{
				System.out.print("No\n");
			}
	}
	public static void Main()
	{
		final String str = "";
		str = new Scanner(System.in).nextLine();
		min(str);
	}
}

