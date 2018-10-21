package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 2;
		String initial = new String(new char[40]);
		initial = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(initial);
		int count = initial.length();
		int mark = 1;
		while (t <= n)
		{
			String word = new String(new char[41]);
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int lenth = word.length();
			count += lenth;
			if (count + t - mark > 80)
			{
				/*for (int i = 0; i < lenth; i++)
				{
					temp[i] = word[i];
				}
				temp[lenth] = '\0';*/
				System.out.print("\n");
				System.out.print(word);
				count = lenth;
				mark = t;
			}
			else
			{
				System.out.print(" ");
				System.out.print(word);
			}
			t++;
		}
		System.out.print("\n");
		return 0;
	}
}

