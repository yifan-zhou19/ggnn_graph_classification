package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int len;
		int i;
		int j;
		int k;
		int p;
		int flag;
		int m;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 2;i <= len;i = i + 2)
		{
			for (j = 0;j < len;j++)
			{
				flag = 0;
				for (k = 0;k < i / 2;k++)
				{
					if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (m = j;m < j + i;m++)
					{
						System.out.printf("%c",a.charAt(m));
					}
					System.out.print("\n");
				}
			}
		}
	return 0;
	}
}
