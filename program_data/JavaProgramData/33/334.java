package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		String word = new String(new char[1000]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	c = System.in.read();
		for (i = 0;i < n;i++)
		{
			word = new Scanner(System.in).nextLine();
			k = word.length();
			for (j = 0;j < k;j++)
			{
				if (word.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (word.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (word.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				if (word.charAt(j) == 'C')
				{
					System.out.print("G");
				}
			}
			if (j == k)
			{
				System.out.print("\n");
			}
		}
	}
}

