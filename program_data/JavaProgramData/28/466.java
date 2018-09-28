package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[3000]);
		int i;
		int k = 0;
		int b = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i <= c.length();i++)
		{
			if (i == c.length())
			{
				System.out.printf("%d",k);
				break;
			}
			else if (c.charAt(i) != ' ')
			{
				k++;
				b = 1;
			}
			else if (b == 1)
			{
				System.out.printf("%d,",k);
				k = 0;
				b = 0;
			}
		}
	}
}
