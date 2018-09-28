package <missing>;

public class GlobalMembers
{
	public static void reserve(int a) //??????
	{
		 int rest;
		 int yu;
		 yu = a % 10; //?????????
		 a = a / 10;
		 if (a >= 1)
		 {
					 System.out.print(yu);
					 reserve(a);
		 }
		 else
		 {
			 System.out.print(yu);
			 System.out.print("\n");
		 }
	}
	public static int Main()
	{
		int input; //?????i????
		int i;
		for (i = 0;i < 6;i++)
		{
						input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						if (input < 0)
						{
									System.out.print("-");
									input = -input;
						}
						for (;;) //??????0
						{
							   if (input % 10 == 0)
							   {
								   input = input / 10;
							   }
							   else
							   {
								   break;
							   }
						}
						reserve(input);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

