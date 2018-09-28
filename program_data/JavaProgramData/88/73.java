package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		int i = 0;
		int j;
		int a = 0;
		int b = 0;
		int num = 0;
		int len;
		len = c.length();
		while (i <= len)
		{
			if ((c.charAt(i) <= '9') && (c.charAt(i) >= '0'))
			{
				if (num == 0)
				{
					a = i;
				}
				b = i;
				num++;
			}
			else
			{
				if (num > 0)
				{
					for (j = a;j <= b;j++)
					{
						System.out.printf("%c",c.charAt(j));
					}
					System.out.print("\n");
					b = i;
					num = 0;
				}
			}
			i++;
		}
		return 0;
	}

}
