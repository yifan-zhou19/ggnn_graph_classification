package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int i = 0;
	int j = 0;
	int t = 0;
	double k;
	double x;
	String n = new String(new char[100]);
	String m = new String(new char[100]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	x = n.length();
	for (i = 0;i < x;i++)
	{
		{
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
	k = n.charAt(i) - 55;
			}
	else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
	{
	k = n.charAt(i) - 87;
	}
	else
	{
		k = n.charAt(i) - 48;
	}
	}
		t = t + k * Math.pow((double)a,x - i - 1.0);
	}
	while (t / b != 0)
	{
		m = tangible.StringFunctions.changeCharacter(m, j, t % b);
	t = t / b;
	j++;
	}
	m = tangible.StringFunctions.changeCharacter(m, j, t % b);

	while (j >= 0)
	{
		if (m.charAt(j) > 9)
		{
			(char)(m.charAt(j) += 55);
		}
	else
	{
		(char)(m.charAt(j) += 48);
	}
	System.out.print(m.charAt(j));
	j--;
	}
	return 0;
	}

}

