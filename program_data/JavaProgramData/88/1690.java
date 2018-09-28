package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[50]);
		int output = 0;
		int i;
		int k = 0;
		int l;
		input = new Scanner(System.in).nextLine();
		l = input.length();
		for (i = 0;i <= l - 1;i++)
		{
							if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
							{
														output = 10 * output + (input.charAt(i) - 48);
														k++;
							}
							else
							{
								 if (k > 0 && input.charAt(i - 1) >= 48 && input.charAt(i - 1) <= 57)
								 {
									 System.out.printf("%d\n",output);
								 output = 0;
								 }
							}
		}
		if (output != 0)
		{
			System.out.printf("%d", output);
		}
		return 0;
	}

}
