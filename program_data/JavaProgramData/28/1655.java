package <missing>;

public class GlobalMembers
{
	public static String sen = new String(new char[10000]);
	public static int Main()
	{
		int[] a = new int[300];
		int x = 0;
		int n = 0;
		int flag = 0;
		int i = 0;
		int len;
		int[] b = new int[300];
		sen = new Scanner(System.in).nextLine();
		len = sen.length();
		for (i = 0;i < len + 1;i++)
		{
			if (sen.charAt(i) != ' ' && sen.charAt(i) != '\0')
			{
				x++;
				flag = 1;
			}
			if ((sen.charAt(i) == ' ' || sen.charAt(i) == '\0') && (flag == 1))
			{
				b[n] = x;
				n++;
				x = 0;
				flag = 0;
			}
		}
			for (i = 0;i < n;i++)
			{
				if (i == n - 1)
				{
					System.out.printf("%d",b[i]);
				}
				else
				{
					System.out.printf("%d,",b[i]);
				}
			}
			return 0;
	}

}
