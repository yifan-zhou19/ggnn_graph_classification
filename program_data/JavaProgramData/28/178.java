package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		int i;
		int n = 0;
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i = i + 1)
		{
			if (c.charAt(i) != ' ')
			{
				n = n + 1;
			}
			else
			{
				if (n != 0)
				{
					if (flag == 0)
					{
						System.out.printf("%d",n);
						flag = 1;
					}
					else
					{
						System.out.printf(",%d",n);
					}
					n = 0;
				}
				else
				{
					continue;
				}
			}
		}
		if (n != 0)
		{
			if (flag != 0)
			{
				System.out.printf(",%d\n",n);
			}
			else
			{
				System.out.printf("%d\n",n);
			}
		}
	}
}
