package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int words = 0;
		int count = 0;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int length1 = 0;
		int length2 = 0;
		int length3 = 0;
		words = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = new Scanner(System.in).nextLine();
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		count = 1;
		System.out.print(str1);
		length1 = str1.length();
		while (count < words)
		{
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length2 = str2.length();
			length1 = length1 + length2 + 1;
			if (length1 <= 80)
			{
				System.out.print(" ");
				System.out.print(str2);
			}
			else
			{
				System.out.print("\n");
				System.out.print(str2);
				str1 = str2;
				length1 = str1.length();
			}
			count++;
		}
		return 0;
	}
}

