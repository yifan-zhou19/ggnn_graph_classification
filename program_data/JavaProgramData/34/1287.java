package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < 2000;k++)
		{
			if (n == 1)
			{
				System.out.print("End");
			break; //?n=1,???End??????
			}
			else if (n % 2)
			{
				int temp0 = n;
			n = n * 3 + 1;
			System.out.print(temp0);
			System.out.print("*3+1");
			System.out.print("=");
			System.out.print(n);
			System.out.print("\n");
			}
			else
			{
				int temp1 = n;
			n = n / 2;
			System.out.print(temp1);
			System.out.print("/2=");
			System.out.print(n);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

