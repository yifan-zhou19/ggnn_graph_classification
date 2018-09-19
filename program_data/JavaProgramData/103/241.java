package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		char ch;
		int sum;

		a = '0';
		while ((ch = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if (ch > 96)
			{
				ch -= 32;
			}
			if (ch != a)
			{
				if (a != '0')
				{
					System.out.printf("(%c,%d)",a,sum);
				}
				a = ch;
				sum = 1;
			}
			else
			{
				sum++;
			}
		}
		System.out.printf("(%c,%d)",a,sum);


		return 0;
	}

}

