package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;a != 1;i++) //?a==1???
		{
						if (a % 2 == 1)
						{
							b = a * 3 + 1;
							System.out.print(a);
							System.out.print("*3+1=");
							System.out.print(b);
							System.out.print("\n");
							a = b;
						} //????????
						else
						{
							b = a / 2;
							System.out.print(a);
							System.out.print("/2=");
							System.out.print(b);
							System.out.print("\n");
							a = b;
						}
		} //????????
						System.out.print("End");
						System.out.print("\n");
						return 0;
	}

}

