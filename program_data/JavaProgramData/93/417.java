package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int i; //??????i
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (i % 3 == 0) //??i?????
		{
			if (i % 5 == 0) //??i??5??
			{
				if (i % 7 == 0) //??i??7??
				{
					System.out.print("3 5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("3 5");
					System.out.print("\n");
				}
			}
			else //??i???5??
			{
				if (i % 7 == 0) //??i??7??
				{
					System.out.print("3 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("3");
					System.out.print("\n");
				}
			}
		}
		else //??i???3??
		{
			if (i % 5 == 0) //??i??5??
			{
				if (i % 7 == 0) //??i??7??
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("5");
					System.out.print("\n");
				}
			}
			else //??i???5??
			{
				if (i % 7 == 0) //??i??7??
				{
					System.out.print("7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("n");
					System.out.print("\n");
				}
			}
		}
		return 0; //????????????????????
	}
}

