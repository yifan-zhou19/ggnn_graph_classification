package <missing>;

public class GlobalMembers
{
	//Patricia.Xiao
	public static int Main()
	{
		String c = new String(new char[1000]);
		int l;
		int i;
		c = new Scanner(System.in).nextLine(); //?????
		l = c.length();
		if (c.charAt(0) != ' ')
		{
			System.out.printf("%c",c.charAt(0)); //?????
		}
		for (i = 1;i < l;i++)
		{
			if (c.charAt(i) != ' ') //???????????
			{
				System.out.printf("%c",c.charAt(i)); //??????
			}
			else
			{
				if (c.charAt(i - 1) != ' ')
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}
