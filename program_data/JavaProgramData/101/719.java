package <missing>;

public class GlobalMembers
{
	public static int exam(String s, char t)
	{
		for (int i = 0; i < 3; i++)
		{
			if (s[i].equals(t))
			{
				return i;
			}
		}
	}

	public static int Main()
	{
		String[] order = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};
		for (int i = 0; i < 6; i++)
		{
			int a = 0;
			int b = 0;
			int c = 0;
			if (exam(order[i], 'B') < exam(order[i], 'A'))
			{
			   a++;
			}
			if (exam(order[i], 'C') - exam(order[i], 'A') == 1)
			{
			   a++;
			}
			if (exam(order[i], 'C') - exam(order[i], 'A') == -1)
			{
			   a++;
			}
			if (exam(order[i], 'A') < exam(order[i], 'B'))
			{
			   b++;
			}
			if (exam(order[i], 'A') < exam(order[i], 'C'))
			{
			   b++;
			}
			if (exam(order[i], 'C') < exam(order[i], 'B'))
			{
			   c++;
			}
			if (exam(order[i], 'B') < exam(order[i], 'A'))
			{
			   c++;
			}
			int k = 0;
			if (exam(order[i], 'A') == a)
			{
				k++;
			}
			if (exam(order[i], 'B') == b)
			{
				k++;
			}
			if (exam(order[i], 'C') == c)
			{
				k++;
			}
			if (k == 3)
			{
				System.out.print(order[i]);
			}

		}
		return 0;
	}
}
