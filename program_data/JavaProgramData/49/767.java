package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int count;
		int s;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 2; i <= str.length(); i++) //??????????
		{
			for (int j = 0; j < str.length() - i + 1; j++) //??????????????????i
			{
				count = 0; //???????0
				s = 2 * j + i - 1;
				for (int k = j; k < j + i; k++) //???????
				{


					if (str.charAt(k) == str.charAt(s - k))
					{
						count++;
					}
				}
				if (i % 2 == 0)
				{
					if (count == i)
					{
						for (int p = j; p < j + i; p++)
						{
							System.out.print(str.charAt(p));
						}
						System.out.print("\n");
					}
				}
				if (i % 2 == 1)
				{
					if (count == i - 1)
					{
						for (int q = j; q < j + i; q++)
						{
							System.out.print(str.charAt(q));
						}
						System.out.print("\n");
					}
				}
			}
		}

		return 0;
	}
}

