package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int flag;
		int m;
		flag = 0;
		String str = new String(new char[500]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		String p;
		for (i = 2;i <= n;i++)
		{
				p = str;
				for (j = 0;j <= n - i;j++)
				{
					for (k = j;k < (j + j + i) / 2;k++)
					{
						if (str.charAt(k) == str.charAt(j + j + i - 1 - k))
						{
							flag = 1;
						}
						else
						{
							flag = 0;
							break;
						}
					}
					if (flag == 1)
					{
						for (m = j;m <= j + i - 1;m++)
						{
							System.out.printf("%c",str.charAt(m));
						}
						System.out.print("\n");
					}
				}
		}
	}




}
