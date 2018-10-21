package <missing>;

public class GlobalMembers
{
	//*************************************************
	//?????????
	//??????
	public static int n; //??????
	public static int jiaogu(int n) //??????
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		}
		while (n != 1) //???
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
			}
			else if (n % 2 != 0)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
			}
			if (n == 1)
			{
				System.out.print("End");
			}
		}
		return 0;
	}
	public static int Main() //???
	{
		jiaogu(n);
		return 0;
	}
}

