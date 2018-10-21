package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int a;
			int b;
			int i;
			int x = 0;
			int len;
			int[] c = new int[10000];
			int[] m = new int[10000];
		String n = new String(new char[10000]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				c[i] = n.charAt(i) - 'a' + 10;
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				c[i] = n.charAt(i) - 'A' + 10;
			}
			else
			{
				c[i] = n.charAt(i) - '0';
			}
					 x = x * a + c[i];
		}
		i = 0;
		for (i = 0;x >= b;i++)
		{
			m[i] = x % b;
			x = x / b;
		}
		m[i] = x;
		len = i;
		for (i = len;i >= 0;i--)
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

