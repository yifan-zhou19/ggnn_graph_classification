package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s1 = new String(new char[100]);
	String s2 = new String(new char[100]);
	String s3 = new String(new char[100]);
	int m;
	while (scanf("%s %s",s1,s2) != EOF)
	{
	m = s1.length();
	int k = 0;
	int j;
	for (j = 1;j < m;j++)
	{
	if (s1.charAt(j) > s1.charAt(k))
	{
		k = j;
	}
	}
	for (j = 0;j <= k;j++)
	{
	s3 = tangible.StringFunctions.changeCharacter(s3, j, s1.charAt(j));
	}
	s3 = tangible.StringFunctions.changeCharacter(s3, k + 1, s2.charAt(0));
	s3 = tangible.StringFunctions.changeCharacter(s3, k + 2, s2.charAt(1));
	s3 = tangible.StringFunctions.changeCharacter(s3, k + 3, s2.charAt(2));
	for (j = k + 4;j < m + 3;j++)
	{
	s3 = tangible.StringFunctions.changeCharacter(s3, j, s1.charAt(j - 3));
	}
	for (j = 0;j < m + 3;j++)
	{
	System.out.printf("%c",s3.charAt(j));
	}
	System.out.print("\n");
	}
	}

}

