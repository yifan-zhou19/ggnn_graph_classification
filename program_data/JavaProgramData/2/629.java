package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] book = new int[1000];
		final String person = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[][] people = new char[100][100];
		int i;
		int j;
		int l;
		int[] t = new int[100];
		for (i = 1;i <= m;i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			people[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(people[i]).length();
			for (j = 0;j < l;j++)
			{
				t[people[i][j] - 'A']++;
			}

		}
		int max = 0;
		int tt;
		for (i = 0;i <= 26;i++)
		{
			if (t[i] > max)
			{
			 max = t[i];
			 tt = i;
			}
		}
		System.out.print(person.charAt(tt));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		int k;
		int[] already = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 1;i <= m;i++)
		{

			l = String.valueOf(people[i]).length();
			for (j = 0;j < l;j++)
			{
				if (people[i][j] == person.charAt(tt))

				{
					 System.out.print(book[i]);
					 System.out.print("\n");
				   for (k = 0;k < l;k++)
				   {
						if ((people[i][k] != person.charAt(tt)) && (already[people[i][k] - 'A'] != 0))
						{
							//cout<<people[i][k]<<endl;
							already[people[i][k] - 'A'] = 0;
						}

				   }
				   break;

				}
			}

		}
		return 0;

	}
}

