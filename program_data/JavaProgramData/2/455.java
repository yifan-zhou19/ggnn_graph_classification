import java.util.*;

public class inf
{
	public int sum;
	public char[][] write = new char[1000][4];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String name = new String(new char[5]);
		String author = new String(new char[27]);
		inf[] book = tangible.Arrays.initializeWithDefaultinfInstances(26);
		for (i = 0;i < 26;i++)
		{
			book[i].sum = 0;
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		while (m - .0.getValue() != 0)
		{
			cin.get(name,5);
			author = new Scanner(System.in).nextLine();
			for (i = 0;i < author.length();i++)
			{
				book[author.charAt(i) - 'A'].sum++;
				for (j = 0;j <= 3;j++)
				{
					if (j < 3)
					{
					book[author.charAt(i) - 'A'].write[book[author.charAt(i) - 'A'].sum][j] = name.charAt(j);
					}
					else
					{
						book[author.charAt(i) - 'A'].write[book[author.charAt(i) - 'A'].sum][j] = '\0';
					}
				}
			}
		}


		int max = 0;
		int t;
		for (i = 0;i < 26;i++)
		{
			if (book[i].sum > max)
			{
				t = i;
				max = book[i].sum;
			}

		}

		System.out.print((char)(t + 'A'));
		System.out.print("\n");
		System.out.print(book[t].sum);
		System.out.print("\n");
		for (i = 1;i <= book[t].sum;i++)
		{
			System.out.print(book[t].write[i]);
			System.out.print("\n");
		}
		return 0;
	}


}

