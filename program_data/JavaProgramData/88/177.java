package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int l;
		l = a.length();
		int i;
		int j;
		int k;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) > '0' && a.charAt(i) <= '9')
			{
				for (j = i + 1;j < l;j++)
				{
					if (a.charAt(j) > '9' || a.charAt(j) < '0')
					{
						break;
					}
				}
				for (k = i;k < j;k++)
				{
					System.out.print(a.charAt(k));
				}
				i = j;
				System.out.print("\n");
			}
			else if (a.charAt(i) == '0')
			{
				for (j = i + 1;j < l;j++)
				{
					if (a.charAt(j) != '0')
					{
						break;
					}
				}
				i = j - 1;
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}

}
