package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		String y = new String(new char[100]);
		int[] m = new int[100];
		int[] x = new int[100];
		int a;
		int b;
		int ten = 0;
		int i = 0;
		int j = 0;
		int k;
		int l;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		for (i = 0;i < l;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				m[i] = n.charAt(i) - 48;
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				m[i] = n.charAt(i) - 55;
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				m[i] = n.charAt(i) - 87;
			}
			double pow = new double(double x,double y);
			ten = ten + m[i] * (int)Math.pow((double)a,(double)(l - 1 - i));
		}
		if (ten == 0)
		{
			System.out.print("0");
		}
		while (ten != 0)
		{
			x[j] = ten % b;
			ten = ten / b;
			if (x[j] >= 0 && x[j] <= 9)
			{
				y = tangible.StringFunctions.changeCharacter(y, j, x[j] + 48);
			}
			else if (x[j] >= 10 && x[j] <= 35)
			{
				y = tangible.StringFunctions.changeCharacter(y, j, x[j] + 55);
			}
			j = j + 1;
		}
		for (k = j - 1;k >= 0;k--)
		{
			System.out.print(y.charAt(k));
		}
		System.out.print("\n");
		return 0;
	}

}

