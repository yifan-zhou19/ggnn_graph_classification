package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum = 0;
		int[] a = new int[500];
		String c = new String(new char[10000]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < c.length() + 1;i++)
		{
			if (c.charAt(i) != ' ' && c.charAt(i) != '\0')
			{
				sum++;
			}
			if (c.charAt(i) == ' ')
			{
				if (sum != 0)
				{
					System.out.printf("%d,",sum);
					sum = 0;
				}
			}
			if (c.charAt(i) == '\0')
			{
				System.out.printf("%d",sum);
			}
		}
		return 0;
	}
}
