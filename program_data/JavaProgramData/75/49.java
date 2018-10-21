package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i = 0;
		int j = 1;
		int q;
		char p;
		while ((q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a[i++] = q;
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (p != ',')
			{
				break;
			}
		}
		String s = new String(new char[4]);
		s = tangible.StringFunctions.changeCharacter(s, 0, p);
		while ((s[j++] = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			if (s.charAt(j - 1) == ',')
			{
				break;
			}
		}
		b[0] = Integer.parseInt(s);
		for (j = 1; j < i - 1; j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = i;
		System.out.print(q);
		System.out.print(' ');
		int sum;
		int max = 0;
		for (i = 0; i < 1000; i++)
		{
			sum = 0;
			for (j = 0; j < q; j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.print(max);
		return 0;
	}
}

