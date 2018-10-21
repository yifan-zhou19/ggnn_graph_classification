package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int firstBig = -1;
		int secBig = -1;

		int temp;
		int ret;
		char ch;

		while (true)
		{
			ret = scanf("%d", temp);
			if (ret != 1)
			{
				break;
			}

			if (temp < 0)
			{
				System.out.print("Invalid input numbet : negtive\n");
				return -1;
			}

			if (temp > secBig)
			{
				if (temp > firstBig)
				{
					secBig = firstBig;
					firstBig = temp;
				}
				else if (temp != firstBig)
				{
					secBig = temp;
				}
			}
			ret = scanf("%c", ch);
			if (ret != 1 || ch != ',')
			{
				break;
			}
		}

		if (secBig == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n", secBig);
		}
		return 0;
	}
}
