package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int len;
		int k = 0;
		int i;
		int n;
		String sen = new String(new char[3001]);
		sen = new Scanner(System.in).nextLine();
		len = sen.length();

		for (i = 0;i < len;i++)
		{

			if (sen.charAt(i) == ' ' && k != 0)
			{
				System.out.printf("%d,",k);
				k = 0;

			}
			else if (i == len - 1)
			{
				System.out.printf("%d",k + 1);
				k = 0;
			}
			else
			{
				if (sen.charAt(i) != ' ')
				{
					k++;
				}
			}
		}


		return 0;
	}


}
