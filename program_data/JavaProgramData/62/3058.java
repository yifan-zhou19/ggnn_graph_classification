package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  char[][] s = new char[2][M];
	  s[0] = new Scanner(System.in).nextLine();
	  a = String.valueOf(s[0]).length();
	  int i;
	  int k;
	  k = 1;
	  s[1][0] = s[0][0];
	  for (i = 1;i < a;i++)
	  {
		if (s[0][i] != ' ' || (s[0][i] == ' ' && s[0][i - 1] != ' '))
		{
		  s[1][k] = s[0][i];
		  k++;
		}
	  }
	  s[1][k] = '\0';
	  a = String.valueOf(s[1]).length();
	  for (i = 0;i < a;i++)
	  {
		System.out.printf("%c",s[1][i]);
	  }
	return 0;
	}
}
