package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????? **
	//*?????1300062805 **
	//*???2013.12.17 **
	//********************************
	public static char[][] c =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static String p = new String(new char[50]);
	public static int n;
	public static int i;

	public static int Main()
	{
		int cnt = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = c; //???????
		for (i = 1; i <= n; i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 1; i < n; i++)
		{
			if (cnt + String.valueOf(*(p.Substring(i))).length() + 1 + String.valueOf(*(p.Substring(i) + 1)).length() <= 80)
			{
				System.out.print((p.Substring(i)));
				System.out.print(' ');
				cnt += String.valueOf(*(p.Substring(i))).length() + 1; //??????????????????
			}
			else if (cnt + String.valueOf(*(p.Substring(i))).length() + 1 + String.valueOf(*(p.Substring(i) + 1)).length() > 80)
			{

				System.out.print((p.Substring(i)));
				System.out.print("\n");
				cnt = 0; //?????????????????
			}

		}
		System.out.print((p.Substring(n)));
		System.out.print("\n");

		return 0;
	}
}

