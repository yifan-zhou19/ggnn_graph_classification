package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N1 = new String(new char[32]);
		int[] N2 = new int[32];
		int[] N3 = new int[32];
		int a;
		int b;
		int n = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		N1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len1 = N1.length();
		for (int i = 0;i < len1;i++)
		{
		if (N1.charAt(i) >= 'a' && N1.charAt(i) <= 'z')
		{
		N1.charAt(i) -= ('a'-'A');
		}
		if (N1.charAt(i) >= 'A' && N1.charAt(i) <= 'Z')
		{
		N3[i] = N1.charAt(i) - 'A' + 10;
		}
		else
		{
		N3[i] = N1.charAt(i) - '0';
		}
		}
		for (int i = 0;i < len1;i++)
		{
		n = n * a + N3[i];
		}
		if (n == 0)
		{
		System.out.print(0);
		System.out.print("\n");
		return 0;
		}
		int j;
		for (j = 0;n != 0;j++)
		{
			N2[j] = n % b;
			n = n / b;
		}
		for (j--;j >= 0;j--)
		{
		if (N2[j] < 10)
		{
			System.out.print(N2[j]);
		}
		else
		{
			System.out.print((char)(N2[j] - 10 + 'A'));
		}
		}
		return 0;

	}



}

