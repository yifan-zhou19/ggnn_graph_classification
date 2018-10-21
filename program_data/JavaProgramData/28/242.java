package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char test = '1';
		String p;
		//int word[300]={0};
		int i = 0;
		//char *q=p;
		while (true)
		{
			while (test != '\n' && test == ' ')
			{
				test = System.in.read();
			}
			int count = 0;
			while (test != '\n' && test != ' ' && test != 0)
			{
				test = System.in.read();
				count++;
			}
			if (i == 0)
			{
				count--;
			}

			System.out.printf("%d",count);
			if (test != '\n')
			{
				System.out.print(",");
			}
			else
			{
				break;
			}
			i++;
		}
		return 0;
	}
}
