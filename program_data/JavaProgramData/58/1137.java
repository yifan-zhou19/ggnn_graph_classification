package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int check = 1;
		String word = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		word = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			check = 1;
			word = new Scanner(System.in).nextLine();
			count = word.length();
			for (j = 0;j < count;j++)
			{
				if (word.charAt(j) == ' ' || word.charAt(j) == '.' || word.charAt(j) == '+' || word.charAt(j) == '-' || word.charAt(j) == '/' || word.charAt(j) == '=')
				{
					check = 0;
				}
			}
			if (check != 0)
			{
				if (word.charAt(0) == '_' || (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') || (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'))
				{
					System.out.print("1\n");
				}
				else
				{
				System.out.print("0\n");
				}
			}
			else
			{
			System.out.print("0\n");
			}

		}

		return 0;
	}
}

