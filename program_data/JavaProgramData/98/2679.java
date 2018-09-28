package <missing>;

public class GlobalMembers
{
	//??????????????????????
	public static int Main()
	{
		int number = 0;
		String string1 = new String(new char[50]);
		String string2 = new String(new char[50]);
		int length1 = 0;
		int length2 = 0;
		int length3 = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		string1 = new Scanner(System.in).nextLine(); //????????????

		string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		k = 1; //k?????????
		System.out.print(string1);
		length1 = string1.length();
		while (k < number)
		{
			string2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length2 = string2.length();
			length1 = length1 + length2 + 1;

			if (length1 <= 80) //??????????<=80?????????????
			{
				System.out.print(" ");
				System.out.print(string2);
			}
			else if (length1 > 80) //??????????????80???????????
			{
				System.out.print("\n");
				System.out.print(string2);
				string1 = string2; //???????????
				length1 = string1.length();
			}
			k++;
		}
		return 0;
	}

}

