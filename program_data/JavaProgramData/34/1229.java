package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 1) //?while????????n>1
		{
			switch (n % 2) //?switch???????
			{
			case 0: //?????????
			  n = n / 2;
			  System.out.print(n * 2);
			  System.out.print("/");
			  System.out.print(2);
			  System.out.print("=");
			  System.out.print(n);
			  System.out.print("\n");
			  break;
			case 1: //?????????
				n = n * 3 + 1;
				System.out.print((n - 1) / 3);
				System.out.print("*");
				System.out.print(3);
				System.out.print("+");
				System.out.print(1);
				System.out.print("=");
				System.out.print(n);
				System.out.print("\n");
				break;
			}

		}
		System.out.print("End");
		return 0;
	}



}

