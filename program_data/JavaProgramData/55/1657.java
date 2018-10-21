package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[1000]);
		int a;
		int b;
		int i;
		int j = 0;
		int num = 0;
		int[] m = new int[1000];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int length = n.length();
		for (i = 0;i < length;i++)
		{
			if (n.charAt(i) > 64 && n.charAt(i) < 91)
			{
				n.charAt(i) += 32;
			}
		}
		for (i = 0;i < length;i++)
		{
			if (n.charAt(i) > 96 && n.charAt(i) < 123)
			{
				num += (n.charAt(i) - 'a' + 10) * Math.pow((double)a,(double)(length - 1 - i));
			}
			else
			{
				num += (n.charAt(i) - '0') * Math.pow((double)a, (double)(length - 1 - i));
			}
		}

		for (i = 0;;i++)
		{
			m[i] = num % b;
			num = num / b;
			j++;
			if (num == 0)
			{
				break;
			}
		}
		for (i = j - 1;i >= 0;i--)
		{
			if (m[i] > 9)
			{
				System.out.print((char)(m[i] - 10 + 'A'));
			}
			else
			{
				System.out.print(m[i]);
			}
		}
		return 0;
	}
}

