package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[1000]);
		int n;
		int i;
		int j = 1;
		m = new Scanner(System.in).nextLine();
		n = m.length();
		for (i = 1;i < n;i++)
		{
			if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
			{
				if (m.charAt(i) != m.charAt(i - 1) && m.charAt(i) != m.charAt(i - 1) - 32)
				{
					if (m.charAt(i - 1) >= 'A' && m.charAt(i - 1) <= 'Z')
					{
						System.out.printf("(%c,%d)",m.charAt(i - 1),j);
					}
					else if (m.charAt(i - 1) >= 'a' && m.charAt(i - 1) <= 'z')
					{
						System.out.printf("(%c,%d)",m.charAt(i - 1) - 32,j);
					}
					j = 0;
				}
			}
			else if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
			{
				if (m.charAt(i) != m.charAt(i - 1) && m.charAt(i) != m.charAt(i - 1) + 32)
				{
					if (m.charAt(i - 1) >= 'A' && m.charAt(i - 1) <= 'Z')
					{
						System.out.printf("(%c,%d)",m.charAt(i - 1),j);
					}
					else if (m.charAt(i - 1) >= 'a' && m.charAt(i - 1) <= 'z')
					{
						System.out.printf("(%c,%d)",m.charAt(i - 1) - 32,j);
					}
					j = 0;
				}
			}
			j = j + 1;
		}
		if (m.charAt(n - 1) >= 'A' && m.charAt(n - 1) <= 'Z')
		{
			System.out.printf("(%c,%d)",m.charAt(n - 1),j);
		}
		else
		{
			System.out.printf("(%c,%d)",m.charAt(n - 1) - 32,j);
		}
		return 0;
	}





}
