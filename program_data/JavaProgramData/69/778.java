package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int[] m = new int[255];
		int[] n = new int[255];
		int s1;
		int s2;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s1 = 0;
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			s1++;
		}
		for (int i = s1 - 1,j = 0;i > -1;i--,j++)
		{
			m[j] = (int)(a.charAt(i) - '0');
		}
		s2 = 0;
		for (int i = 0;b.charAt(i) != '\0';i++)
		{
			s2++;
		}
		for (int i = s2 - 1,j = 0;i > -1;i--,j++)
		{
			n[j] = (int)(b.charAt(i) - '0');
		}
		if (s1 < s2)
		{
			s1 = s2;
		}
		for (int i = 0;i < s1;i++)
		{
				m[i] = m[i] + n[i];
				if (m[i] >= 10)
				{
					m[i] = m[i] - 10;
					m[i + 1]++;
				}
		}
		s2 = 0;
		int i = s1;
			while (m[i--] == 0 && s2 < s1)
			{
				s2++;
			}
		for (int i = s1 - s2;i > -1;i--)
		{
			System.out.print(m[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

