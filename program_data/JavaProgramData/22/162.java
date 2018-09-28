package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] m = new int[max];
		int gs;
		int r;
		int s;
		int temp;
		int k;
		String a = new String(new char[2000]);
		a = new Scanner(System.in).nextLine();
		j = a.length();
		gs = 1;
		for (i = 0;i < j;i++)
		{
			if (a.charAt(i) != ',')
			{
				m[gs] = m[gs] * 10 + (a.charAt(i) - 48);
			}
			else
			{
				gs++;
			}
		}
		if (gs == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (r = 1;r <= gs;r++)
			{
				for (s = 1;s < gs;s++)
				{
					if (m[s] < m[s + 1])
					{
						temp = m[s];
						m[s] = m[s + 1];
						m[s + 1] = temp;
					}
				}
			}
			k = 0;
			for (r = 2;r <= gs;r++)
			{
				if (m[r] != m[1])
				{
					System.out.printf("%d",m[r]);
					k++;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("No");
			}
		}
	}
}
