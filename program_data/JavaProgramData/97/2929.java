package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 10;i++)
		{
			if (n >= 100)
			{
				n = n - 100; //??100??? ??????100???100????????100
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}
		for (int i = 0;i < 3;i++)
		{
			if (n >= 50)
			{
				n = n - 50; //??50??????
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}
		for (int i = 0;i < 3;i++)
		{
			if (n >= 20)
			{
				n = n - 20; //??20???
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}
		for (int i = 0;i < 3;i++)
		{
			if (n >= 10)
			{
				n = n - 10; //??10???
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}
		for (int i = 0;i < 3;i++)
		{
			if (n >= 5)
			{
				n = n - 5; //??5???
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}
		for (int i = 0;i < 10;i++)
		{
			if (n >= 1)
			{
				n = n - 1; //??1???
			}
			else
			{
				System.out.print(i);
				System.out.print("\n");
				break;

			}
		}

		return 0;
	}

}

