package <missing>;

public class GlobalMembers
{
	/*
	 *function: ????
	 *created on: 2012-12-17
	 *author: ???
	 */
	public static int Main()
	{
		String a = new String(new char[30]);
		int len;
		int i;
		a = new Scanner(System.in).nextLine(); // ????????a???
		len = a.length();
		if (*a >= '0' && *a <= '9')
		{
			System.out.print(a);
		}
		for (i = 1;i < len;i++)
		{
			if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
			{
				System.out.print((a.Substring(i)));
			}
			else if ((*(a.Substring(i)) < '0' || *(a.Substring(i))>'9') && (*(a.Substring(i) - 1) >= '0' && *(a.Substring(i) - 1) <= '9'))
			{
				System.out.print("\n");
			}
			else
			{
				continue; // ??????
			}
		}
		return 0;
	}

}
