package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (;n > 0;n--)
		{
			c = System.in.read();
			while (c != '\n')
			{
				switch (c)
				{
				case 'A':
					System.out.print('T');
					break;
				case 'T':
					System.out.print('A');
					break;
				case 'C':
					System.out.print('G');
					break;
				case 'G':
					System.out.print('C');
					break;
				default:
					break;
				}
				c = System.in.read();
			}
			System.out.print('\n');
		}
	}
}

