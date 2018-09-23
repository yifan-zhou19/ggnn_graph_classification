package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int n;
		int i;
		int j = 0;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
			if (c.charAt(i) != c.charAt(i - 1) && c.charAt(i) != c.charAt(i - 1) - 32)
			{
				if (c.charAt(i - 1) >= 'A' && c.charAt(i - 1) <= 'Z')
				{
					System.out.printf("(%c,%d)",c.charAt(i - 1),j);
				}
				else if (c.charAt(i - 1) >= 'a' && c.charAt(i - 1) <= 'z')
				{
					System.out.printf("(%c,%d)",c.charAt(i - 1) - 32,j);
				}
				j = 0;
			}
			}
			else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				if (c.charAt(i) != c.charAt(i - 1) && c.charAt(i) != c.charAt(i - 1) + 32)
				{
					if (c.charAt(i - 1) >= 'A' && c.charAt(i - 1) <= 'Z')
					{
					System.out.printf("(%c,%d)",c.charAt(i - 1),j);
					}
				else if (c.charAt(i - 1) >= 'a' && c.charAt(i - 1) <= 'z')
				{
					System.out.printf("(%c,%d)",c.charAt(i - 1) - 32,j);
				}
					j = 0;
				}
			}
			j++;
		}
			if (c.charAt(n - 1) >= 'A' && c.charAt(n - 1) <= 'Z')
			{
					System.out.printf("(%c,%d)",c.charAt(n - 1),j);
			}
				else if (c.charAt(n - 1) >= 'a' && c.charAt(n - 1) <= 'z')
				{
					System.out.printf("(%c,%d)",c.charAt(n - 1) - 32,j);
				}
		return 0;
	}
}
