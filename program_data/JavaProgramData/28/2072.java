package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[3001]);
	public static int len;

	public static int Main()
	{
		int i;
		int miao = 1;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i <= len;i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				if (n != 0)
				{
					if (miao != 1)
					{
						System.out.print(",");
					}
						System.out.printf("%d",n);
						miao++;
				}
				n = 0;
			}
			else
			{
			n++;
			}
		}
		System.out.print("\n");
		return 0;
	}




}
