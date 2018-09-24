package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int t;
	int n;
	int i;
	int l;
	int j;
	int m;
	int k;
	int x;
	String s = new String(new char[800]);
	String a = new String(new char[500]);
	String b = new String(new char[500]);
	s = new Scanner(System.in).nextLine();
	for (i = 0;s.charAt(i) != ' ';i++)
	{
	a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(i));
	}
	a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	i++;
	for (j = 0;s.charAt(j + i) != '\0';j++)
	{
	b = tangible.StringFunctions.changeCharacter(b, j, s.charAt(j + i));
	}
	b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	t = 0;
	if (i - 1 == j)
	{
	for (k = 0;a.charAt(k) != '\0';k++)
	{
		for (l = 0;b.charAt(l) != '\0';l++)
		{
		x = 0;
		  if (a.charAt(k) == b.charAt(l))
		  {
		  b = tangible.StringFunctions.changeCharacter(b, l, ' ');
		  x = 1;
		  break;
		  }
		}
		if (x == 0)
		{
			System.out.print("NO");
			break;
		}
	if (a.charAt(k + 1) == '\0')
	{
		System.out.print("YES");
	}
	}
	}
	else
	{
		System.out.print("NO");
	}
	}
}

