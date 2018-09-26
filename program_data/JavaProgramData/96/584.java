package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int[] b = new int[110];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		int i = 0;
		for (i = 0;i < len;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (len == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[0]);
			System.out.print("\n");
			return 0;
		}
		int k = 0;
		k = 10 * b[0] + b[1];
		b[1] = k % 13;
		if (k >= 13)
		{
			System.out.print(k / 13);

		}
		else if (len == 2)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(k);
			System.out.print("\n");
			return 0;
		}
		for (i = 1;i < len - 1;i++)
		{
			k = b[i] * 10 + b[i + 1];
			System.out.print(k / 13);
			b[i + 1] = k % 13;
		}
		System.out.print("\n");
		System.out.print(b[i]);
		System.out.print("\n");
		return 0;


	}
}

