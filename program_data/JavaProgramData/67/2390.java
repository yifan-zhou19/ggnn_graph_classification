package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //??????????
		int a0 = 0;
		int b0 = 0;
		double c0; //???
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c0 = (double)b0 / a0;
		for (int i = 1;i < n;i++) //n-1???????
		{
						int a = 0; //???????
						int b = 0;
						double c = 0; //???
						a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						c = (double)b / a;
						if (c > c0) //??????????
						{
								if ((c - c0) * 100 <= 5)
								{
									System.out.print("same");
									System.out.print("\n");
								}
								else
								{
									System.out.print("better");
									System.out.print("\n");
								}
						}
						if (c < c0)
						{
								 if ((c0 - c) * 100 <= 5)
								 {
									 System.out.print("same");
									 System.out.print("\n");
								 }
								 else
								 {
									 System.out.print("worse");
									 System.out.print("\n");
								 }
						}
		}

		return 0;

	}

}

