package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int len = 0;
		int tag = 1;
		int flag = 1;
		String c = new String(new char[6000]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < 6000;i++)
		{
			if (c.charAt(i) != ' ' && c.charAt(i) != '\0')
			{
				tag = 1;
				len++;
			}
			else if (c.charAt(i) == ' ')
			{
				if (tag == 1 && flag == 1)
				{
					System.out.printf("%d",len);
					flag = 0;
				}
				else if (tag == 1 && flag == 0)
				{
					System.out.printf(",%d",len);
				}
				else
				{
					continue;
				}
				tag = 0;
				len = 0;
			}
			else if (c.charAt(i) == '\0')
			{
				if (flag == 0)
				{
					System.out.printf(",%d",len);
				}
				else if (flag == 1)
				{
					System.out.printf("%d",len);
				}
				break;
			}
		}
	}
}
