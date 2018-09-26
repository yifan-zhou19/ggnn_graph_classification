package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][50]; //???????????????????
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		int sum = 0; //sum?????????
		for (i = 0;i < n;i++)
		{
			if (sum + String.valueOf(*(a + i)).length() + 1 > 80) //??????????
			{
				System.out.print("\n");
				System.out.print((a + i));
				sum = String.valueOf(*(a + i)).length();
				continue;
			}
			sum += String.valueOf(*(a + i)).length() + 1;
			if (i == 0) //????????????
			{
				System.out.print((a + i));
				sum--;
				continue;
			}
			System.out.print(' ');
			System.out.print((a + i));
		}
		return 0;
	}
}

