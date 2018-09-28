package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i = 0;
		int n = 0;
		while (1 == 1)
		{
			n = System.in.read();
			if (n == ' ')
			{
				if (i != 0)
				{
					System.out.printf("%d,",i);
					i = 0;
				}
			}
			else if (n != '\0' && n != '\n')
			{
				i++;
			}
			else if (n == '\n')
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

}
