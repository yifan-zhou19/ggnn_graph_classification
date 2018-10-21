package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[40]);
		int n;
		int sum = 0;
		int i;
		int first = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			sum = sum + (word.length()) + 1; //?????????????????
			if (sum <= 81) //????????80?(????????)?????
			{
				if (first == 0)
				{
					System.out.print(word);
				first = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(word);
				}
			}
			else
			{
				first = 0;
				System.out.print("\n");
				System.out.print(word);
				System.out.print(" ");
				sum = word.length() + 1; //????????????
			}
		}

		return 0;
	}
}

