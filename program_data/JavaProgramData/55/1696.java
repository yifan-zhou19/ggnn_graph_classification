package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	int b;
	String c = new String(new char[1000]);
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	c = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int num = 0;
	int len;
	int i;
	int remain;
	double[] x = new double[1000];
	len = c.length();
	String m = new String(new char[1000]);
	int[] o = new int[1000];

	for (i = 0;i < len;i++)
	{
		if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
		{
			x[i] = c.charAt(i) - 'a' + 10;
		}
		if (c.charAt(i) <= 'Z' && c.charAt(i) >= 'A')
		{
			x[i] = c.charAt(i) - 'A' + 10;
		}
		if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
		{
			x[i] = c.charAt(i) - '0';
		}
	}
	for (i = 0;i < len;i++)
	{
		num += x[i] * Math.pow(a,len - 1 - i);
	}
	remain = num;


	int p = 0;
	do
	{
		o[p] = remain % b;
		remain = (remain - o[p]) / b;
		p++;
	} while (remain > 0);

	for (i = 0;i < p;i++)
	{
		if (o[i] >= 10)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, o[i] - 10 + 'A');
		}
		else
		{
			m = tangible.StringFunctions.changeCharacter(m, i, o[i] + '0');
		}
	}
	for (i = p - 1;i >= 0;i--)
	{
		System.out.print(m.charAt(i));
	}
	return 0;

	}
}

