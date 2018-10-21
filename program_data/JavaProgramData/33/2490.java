package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int LEN;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0 ; i < n ; i++)
		{
			String s = new String(new char[1000]);
			s = new Scanner(System.in).nextLine();
			LEN = s.length();
			for (j = 0 ; j < LEN ; j++)
			{
				switch (s.charAt(j))
				{
				case 'A':
					System.out.print("T");
					break;
				case 'T':
					System.out.print("A");
					break;
				case 'C':
					System.out.print("G");
					break;
				case 'G':
					System.out.print("C");
					break;
				}
			}
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

