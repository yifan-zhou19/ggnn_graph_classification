package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String m = new String(new char[350]);
	String n = new String(new char[350]);
	int i;
	int t = 0;
	int j;
	int k = 1;
	int h;
	int a;
	int b;
	m = new Scanner(System.in).nextLine();
	for (i = 0;i < m.length();i++)
	{
		if ((int)m.charAt(i) < 123 && (int)m.charAt(i)>96)
		{
		n = tangible.StringFunctions.changeCharacter(n, t, m.charAt(i));
	t++;
		}
	}
	for (a = t - 1;a > 0;a--)
	{
	for (b = 0;b < a;b++)
	{
	if (n.charAt(b) > n.charAt(b + 1))
	{
		int temp;
	temp = n.charAt(b);
	n = tangible.StringFunctions.changeCharacter(n, b, n.charAt(b + 1));
	n = tangible.StringFunctions.changeCharacter(n, b + 1, temp);
	}
	}
	}

	if (t != 0)
	{
		for (i = 0;i < t;i++)
		{
		for (j = i + 1;j < t;j++)
		{
		 if (n.charAt(i) == n.charAt(j) && n.charAt(i) != '0')
		 {
			 k++;
		 n = tangible.StringFunctions.changeCharacter(n, j, '0');
		 }
		}
	if (n.charAt(i) != '0')
	{
		System.out.printf("%c=%d\n",n.charAt(i),k);
	}
	k = 1;
		}
	}
	else
	{
	System.out.print("No");
	}
	return 0;
	}
}

