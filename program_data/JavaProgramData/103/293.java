package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String text = new String(new char[1000]);
		text = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] index = new int[40];
		int[] count = new int[40];
		int temp = 1;
		int len;
		int sort = 0;
		len = text.length();
		int i;
		int j;
		int k;

		for (i = 1; i < len; i++)
		{
			if (Character.toUpperCase(text.charAt(i)) != Character.toUpperCase(text.charAt(i - 1)))
			{
				count[sort] = temp;
				sort++;
				index[sort] = i;
				temp = 1;
			}
			else
			{
				temp++;
			}
		}
		count[sort] = temp;

		for (i = 0; i <= sort; i++)
		{
			System.out.print("(");
			System.out.print((char)Character.toUpperCase(text.charAt(index[i])));
			System.out.print(",");
			System.out.print(count[i]);
			System.out.print(")");
		}
		System.out.print("\n");

		return 0;
	}
}

