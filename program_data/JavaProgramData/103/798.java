package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1010]);
		char mark;
		int i;
		int j;
		int sum;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = j = 0;
		do
		{
			sum = 0;
			do
			{
				j++;
				sum++;
			}while (str.charAt(i) - 'A' == str.charAt(j) - 'A' || str.charAt(i) - 'A' == str.charAt(j) - 'a' || str.charAt(i) - 'a' == str.charAt(j) - 'A');
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				mark = str.charAt(i) - 'a' + 'A';
			}
			else
			{
				mark = str.charAt(i);
			}
			System.out.print("(");
			System.out.print(mark);
			System.out.print(",");
			System.out.print(sum);
			System.out.print(")");
			i = j;
		}while (str.charAt(i) != '\0');
		return 0;
	}
}

