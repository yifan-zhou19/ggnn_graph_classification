package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3;i <= 7;i = i + 2) //????????
		{
			if (n % i == 0)
			{
		num++; //???????????
		if (num == 1)
		{
		System.out.print(i);
		}
		else if (num != 2 || num != 3)
		{
			System.out.print(" ");
			System.out.print(i);
		}
			} //?????????????????

		}
	if (num == 0)
	{
		System.out.print("n");
	}

	return 0;
	}

}

