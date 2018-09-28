package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String word = new String(new char[200]);
		System.in.read();
		int sum;
		cin.getline(word,200,' ');
		System.out.print(word);
		sum = word.length() + 1;
		for (int i = 1;i < n;i++)
		{
			cin.getline(word,200,' ');
			if (sum + word.length() > 80)
			{
				System.out.print("\n");
				System.out.print(word);
				sum = 0;
			}
			else
			{
				System.out.print(' ');
				System.out.print(word);
			}
			sum += word.length() + 1;
		}
		return 0;
	}

}

