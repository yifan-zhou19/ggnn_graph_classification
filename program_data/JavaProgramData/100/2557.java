package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[310]);
		int[] cishu = new int[52];
		int i;
		int j;
		int k = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < c.length();i++)
		{
								if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
								{
								cishu[c.charAt(i) - 65] += 1;
								}
								if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
								{
								cishu[c.charAt(i) - 71] += 1;
								}
		}
		for (i = 0;i < 52;i++)
		{
						 if (i >= 0 && i <= 25 && cishu[i]>0)
						 {
													System.out.printf("%c=%d\n",i + 65,cishu[i]);
													k += 1;
						 }
						 if (i >= 26 && i <= 51 && cishu[i]>0)
						 {
													 System.out.printf("%c=%d\n",i + 71,cishu[i]);
													 k += 1;
						 }
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
