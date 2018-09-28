package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[101]);
	  String str1 = new String(new char[101]);
	  int i;
	  int n;
	  int m;
	  int e;
	  str = new Scanner(System.in).nextLine();
	  n = str.length();
	  m = 0;
	  for (i = 1;i <= n;i++)
	  {
		if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
		{
		continue;
		}
		else
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, m, str.charAt(i));
		m++;
		}
	  }
	System.out.printf("%c",str.charAt(0));
	  System.out.println(str1);
	  return 0;
	}
}

