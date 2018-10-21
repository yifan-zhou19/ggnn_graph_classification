package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] number = new int[n + 1];
		int[] writer = new int[26];
		char[][] book = new char[n + 1][27];
		for (int i = 1; i <= n; ++i)
		{
				number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				book[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				for (int t = 0; t < String.valueOf(book[i]).length(); ++t)
				{
						writer[book[i][t] - 'A']++;
				}
		}
		int nn = 0;
		for (int i = 0; i < 26; ++i)
		{
				nn = Math.max(nn,writer[i]);
		}
		int person1;
		for (int i = 0; i < 26; ++i)
		{
				if (writer[i] == nn)
				{
							 person1 = i;
							 break;
				}
		}
		char person = person1 + 'A';
		System.out.print(person);
		System.out.print("\n");
		System.out.print(nn);
		System.out.print("\n");
		for (int i = 1; i <= n; ++i)
		{
				for (int t = 0; t < String.valueOf(book[i]).length(); ++t)
				{
						if (book[i][t] == person)
						{
									  System.out.print(number[i]);
									  System.out.print("\n");
									  break;
						}
				}
		}
		//while(1);
		return 0;
	}

}

