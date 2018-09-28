package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] X = new int[251];
		int[] Y = new int[250];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l1 = a.length();
		int l2 = b.length();
		int i;
		int k = 0;
		for (i = l1 - 1;i >= 0;i--)
		{
			X[k++] = a.charAt(i) - '0';
		}
		k = 0;
		for (i = l2 - 1;i >= 0;i--)
		{
			Y[k++] = b.charAt(i) - '0';
		}

		if (l1 >= l2)
		{
			k = l1;
		}
		else
		{
			k = l2;
		}

		for (i = 0;i < k;i++)
		{
			X[i] += Y[i];
			if (X[i] >= 10)
			{
				X[i + 1] += 1;
				X[i] %= 10;
			}
		}
		i = k;
		while (i > 0)
		{
			if (X[i] != 0)
			{
				break;
			}
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(X[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

