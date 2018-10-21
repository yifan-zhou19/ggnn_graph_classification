package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[50]);
		int n;
		int sum = 0;
		int temp = 0;
		int lens;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			words = ConsoleInput.readToWhiteSpace(true).charAt(0);
			lens = words.length();
			if (lens + sum < 80)
			{
				if (temp == 0)
				{
					System.out.print(words);
					sum = sum + lens;
					temp++;
				}
				else
				{
					System.out.print(" ");
					System.out.print(words);
					sum = sum + lens + 1;
					temp++;
				}
			}
			else
			{
				System.out.print("\n");
				System.out.print(words);
				System.out.print(" ");
				sum = lens + 1;
				temp = 0;
			}
			n--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(words,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

