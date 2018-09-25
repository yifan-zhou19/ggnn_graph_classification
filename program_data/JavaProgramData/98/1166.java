package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		int[] wordlen = new int[1000]; //sum??????????
		int i;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			word = tangible.StringFunctions.changeCharacter(word, i, ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			wordlen[i] = String.valueOf(word.charAt(i)).length(); //?????????
		}
		System.out.print(word.charAt(0));
		sum = wordlen[0];
		for (i = 1;i < n;i++)
		{
			if ((wordlen[i] + 1 + sum) <= 80)
			{
				System.out.print(" ");
				System.out.print(word.charAt(i));
				sum = sum + wordlen[i] + 1;
			}
			else
			{
				System.out.print("\n");
				sum = wordlen[i];
				System.out.print(word.charAt(i));
			}
		}
		return 0;
	}
}

