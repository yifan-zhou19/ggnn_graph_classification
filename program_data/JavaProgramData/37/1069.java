package <missing>;

public class GlobalMembers
{
	public static String letters = new String(new char[100000]);
	public static int[] check = new int[100000];

	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int length;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		letters = new Scanner(System.in).nextLine();
		for (i = 0 ; i < t ; i++)
		{
			for (j = 0 ; * (letters.Substring(j)) ; j++)
			{
				*(letters.Substring(j)) = '\0';
				check[j] = 0;
			}
			letters = new Scanner(System.in).nextLine();
			length = letters.length();
			if (length == 1)
			{
				System.out.printf("%c\n",*letters);
			}
			else
			{
				for (j = 1 ; j < length ; j++)
				{
					for (k = 0 ; k < j ; k++)
					{
						if (*(letters.Substring(j)) == *(letters.Substring(k)))
						{
							check[k] = (check + j) = 1;
						}
					}
				}
				for (j = 0 ; j < length ; j++)
				{
					if (check[j] == 0)
					{
						System.out.printf("%c\n",*(letters.Substring(j)));
						break;
					}
				}
				if (j == length)
				{
					System.out.print("no\n");
				}
			}
		}

		return 0;

	}
}

