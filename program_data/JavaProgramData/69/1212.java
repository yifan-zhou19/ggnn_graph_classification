package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int l = 200;
		int[] n1 = new int[l + 10];
		int[] n2 = new int[l + 10];
		String n10 = new String(new char[l + 10]);
		String n20 = new String(new char[l + 10]);
		int i;
		int j;
		for (i = 0; i < l + 10; i++)
		{
			n1[i] = n2[i] = n10[i] = n20[i] = 0;
		}
		n10 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n20 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l1 = n10.length();
		int l2 = n20.length();
		i = l1 + 1, j = 0;
		while (--i != 0)
		{
			n1[j] = n10.charAt(i - 1) - '0';
			j++;
		}
		i = l2 + 1;
		j = 0;
		while (--i != 0)
		{
			n2[j] = n20.charAt(i - 1) - '0';
			j++;
		}
		int lm = l1 > l2 != 0 ? l1 : l2;
		for (i = 0; i < lm; i++)
		{
			n1[i] += n2[i];
			if (n1[i] > 9)
			{
				n1[i + 1] += n1[i] / 10;
				n1[i] = n1[i] % 10;
			}
		}
		i = l + 1;
		while (n1[i] == 0)
		{
			i--;
		}
		if (i < 0)
		{
			System.out.print('0');
		}
		else
		{
			i++;
			while (i-- != 0)
			{
				System.out.print(n1[i]);
			}
		}
		return 0;
	}
}

