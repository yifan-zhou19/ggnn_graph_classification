package <missing>;

public class GlobalMembers
{
	/*?????????????
	 *??????
	 *???2011-4-10
	 */
	public static int Main()
	{
		String word = new String(new char[41]);
		int counter;
		int num;
		int len;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		counter = 0;
		for (int i = 0; i < num; i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = word.length();
			counter += len;
			if (counter + 1 > 80)
			{
				System.out.print("\n");
				counter = len;
			}
			else if (counter != len)
			{
				System.out.print(' ');
				counter++;
			}
			System.out.print(word);
		}
		return 0;
	}

}

