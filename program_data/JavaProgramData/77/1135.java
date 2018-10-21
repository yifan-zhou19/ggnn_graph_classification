package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		char c;
		a = new Scanner(System.in).nextLine();
		c = a.charAt(0);
		int i;
		int n;
		int j;
		int k;
		n = a.length();
		for (j = 1;j < n / 2 + 1;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) != c && a.charAt(i) != 0)
				{
					for (k = i - 1;k >= 0;k--)
					{
						if (a.charAt(k) != 0)
						{
							System.out.printf("%d %d\n",k,i);
							a = a.substring(0, i);
							a = a.substring(0, k);
							break;
						}
					}
					break;
				}
			}
		}
	}

}
