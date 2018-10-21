package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int m;
	int n;
	int k;
	m = 0;
	char temp;
	char b;
	char c;
	char t;
	String str1 = new String(new char[100]);
	String str2 = new String(new char[200]);
	String str = new String(new char[100]);
	str = new Scanner(System.in).nextLine();
	n = str.length();

	if (n % 2 != 0)
	{
		for (i = 0;i < (n - 1) / 2;i++)
		{
	  str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i));
		}

	for (i = (n + 1) / 2;i < n;i++)
	{
	  str2 = tangible.StringFunctions.changeCharacter(str2, i - (n + 1) / 2, str.charAt(i));
	}

	for (j = 0;j < (n - 3) / 2;j++)
	{
	   for (i = 0;i < (n - 3) / 2 - j;i++)
	   {
		   if (str1.charAt(i) > str1.charAt(i + 1))
		   {
			   temp = str1.charAt(i);
			   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i + 1));
			   str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, temp);

		   }
	   }
	}

	for (j = 0;j < (n - 3) / 2;j++)
	{
	   for (i = 0;i < (n - 3) / 2 - j;i++)
	   {
		   if (str2.charAt(i) > str2.charAt(i + 1))
		   {
			  temp = str2.charAt(i);
			   str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i + 1));
			   str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, temp);

		   }
	   }
	}

	for (i = 0;i < (n - 1) / 2;i++)
	{
	   if (str1.charAt(i) != str2.charAt(i))
	   {
		   m = 1;
	   break;
	   }
	}
	if (m == 0)
	{
	  System.out.print("YES");
	}
	else
	{
	System.out.print("NO");
	}
	}
	else
	{
		System.out.print("NO");
	}
	}
}

