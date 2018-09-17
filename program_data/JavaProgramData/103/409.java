package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[100]);
		int[] count = new int[100];
		int i = 0;
		int t = 0;
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;m.charAt(i) != '\0';i++)
		{
			if (count[t] == 0)
			{
				count[t]++;
			}
			else if (m.charAt(i) == m.charAt(i - 1) || m.charAt(i) - m.charAt(i - 1) == 'A'-'a' || m.charAt(i) - m.charAt(i - 1) == 'a'-'A')
			{
				count[t]++;
			}
			else
			{
				t++;
				count[t] = 1;
			}
		}
		int sum = 0;
		for (i = 0;i <= t;i++)
		{
			sum += count[i];
			if (m.charAt(count[i] - 1) >= 'A' && m.charAt(count[i] - 1) <= 'Z')
			{
				;
			}
			else
			{
				m.charAt(count[i] - 1) += 'A'-'a';
			}
			System.out.print('(');
			System.out.print(m.charAt(sum - 1));
			System.out.print(',');
			System.out.print(count[i]);
			System.out.print(')');
		}
		System.out.print("\n");
		return 0;
	}
}

