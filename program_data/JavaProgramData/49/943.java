package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int len2;
		int start;
		int end;
		int judge;
		int i;
		int p;
		String input = new String(new char[500]);
		String sample = new String(new char[500]);
		input = new Scanner(System.in).nextLine();
		len = input.length();
		for (len2 = 2;len2 <= len;len2++)
		{
			for (start = 0;start <= len - len2;start++)
			{
				judge = 1;
				end = start + len2 - 1;
				for (i = start;i <= end;i++)
				{
					if (input.charAt(i) != input.charAt(end + start - i))
					{
						judge = 0;
					}
				}
				if (judge == 1)
				{
					for (i = start;i <= end;i++)
					{
						System.out.printf("%c",input.charAt(i));
					}
					System.out.print("\n");
				}
			}
		}
	return 0;
	}
}
