package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //???a
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0; //??a??3?5?7?????
		for (int i = 3;i <= 7;i += 2)
		{
			if (a % i == 0)
			{
				num++;
				if (num != 1)
				{
					System.out.print(" ");
					System.out.print(i);
				}
				else if (num == 1)
				{
					System.out.print(i);
				}
				?????? */ 
			}
		}
			if (num == 0)
			{
				System.out.print("n");
			}

			return 0;
	}

}

