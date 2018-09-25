package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	String a = new String(new char[123]);
	String b = new String(new char[123]);
	a = new Scanner(System.in).nextLine();
	m = a.length();
	  for (i = 0;i < m - 1;i++)
	  {
	  b = tangible.StringFunctions.changeCharacter(b, i, ((int)(a.charAt(i)) + (int)(a.charAt(i + 1))) % 256);
	  }
	  b = tangible.StringFunctions.changeCharacter(b, m - 1, ((int)(a.charAt(m - 1)) + (int)(a.charAt(0))) % 256);
	for (j = 0;j < m;j++)
	{
			System.out.printf("%c",b.charAt(j));
	}
		return 0;



	}
}

