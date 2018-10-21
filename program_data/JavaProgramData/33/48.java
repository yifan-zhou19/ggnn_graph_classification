package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		int n;
		int j;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < a.length();j++)
			{
				switch (a.charAt(j))
				{
				case 'A':
					System.out.print('T');
					break;
				case 'T':
					System.out.print('A');
					break;
				case 'G':
					System.out.print('C');
					break;
				case 'C':
					System.out.print('G');
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

