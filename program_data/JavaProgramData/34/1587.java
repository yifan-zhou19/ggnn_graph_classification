package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int a;
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 1)
		{
		System.out.print("End");
		System.out.print("\n");
		}
		if (a != 1)
		{
			for (i = 0;a != 1;i++)
			{

			 if (a % 2 == 1)
			 {
						k = a * 3 + 1;
						System.out.print(a);
						System.out.print("*");
						System.out.print("3");
						System.out.print("+");
						System.out.print("1");
						System.out.print("=");
						System.out.print(k);
						System.out.print("\n");
			 }
			 else
			 {
						k = a / 2;
						System.out.print(a);
						System.out.print("/");
						System.out.print("2");
						System.out.print("=");
						System.out.print(k);
						System.out.print("\n");
			 }
			   a = k;
			 if (k == 1)
			 {
				 System.out.print("End");
				 System.out.print("\n");
			 break;
			 }

			}
		}
		return 0;
	}
}

