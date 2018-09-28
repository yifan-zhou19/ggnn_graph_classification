package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		int i;
		int j;
		int a;
		int b;
		int num = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n.length();i++)
		{
		if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
		{
			x[i] = n.charAt(i) - 'A' + 10;
		}
		else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		{
			x[i] = n.charAt(i) - 'a' + 10;
		}
		else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		{
			x[i] = n.charAt(i) - '0';
		}
		num = num * a + x[i];
		}
		for (i = 0;;i++)
		{
		y[i] = num % b;
		num = (num - y[i]) / b;
		if (y[i] >= 0 && y[i] <= 9)
		{
			 m = tangible.StringFunctions.changeCharacter(m, i, y[i] + '0');
		}
		else
		{
			m = tangible.StringFunctions.changeCharacter(m, i, y[i] - 10 + 'A');
		}
		if (num == 0)
		{
			break;
		}
		}
		for (j = i;j >= 0;j--)
		{
		System.out.print(m.charAt(j));
		}
		return 0;
	}
}

