package <missing>;

public class GlobalMembers
{
	public static int decimal(String c, int x)
	{
		int d = 0;
		for (int i = 0; !c[i].equals('\0');i++)
		{
			if (c[i].compareTo('0') >= 0 && c[i].compareTo('9') <= 0)
			{
				d = d * x + c[i] - '0';
			}
			if (c[i].compareTo('A') >= 0 && c[i].compareTo('Z') <= 0)
			{
				d = d * x + c[i] - 'A' + 10;
			}
			if (c[i].compareTo('a') >= 0 && c[i].compareTo('z') <= 0)
			{
				d = d * x + c[i] - 'a' + 10;
			}
		}
		return d;
	}

	public static int Main()
	{
		int a;
		int b;
		int length;
		char[] n = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x = decimal(n, a);
		for (int i = 0;x >= 0;i++)
		{
			int remainder = x % b;
			n[i] = remainder < 10?'0' + remainder:'A' + remainder - 10;
			x = (x - remainder) / b;
			length = i;
			if (x == 0)
			{
				break;
			}
		}
		for (int i = length;i >= 0;i--)
		{
			System.out.print(n[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

