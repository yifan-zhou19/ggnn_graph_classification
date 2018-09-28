package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 1)
		{ //??????n
		if (n % 2 == 0)
		{
			a = n / 2;
			System.out.print(n);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(a);
			System.out.print("\n");
		}
		else
		{
			 a = n * 3 + 1;
			 System.out.print(n);
			 System.out.print("*");
			 System.out.print(3);
			 System.out.print("+");
			 System.out.print(1);
			 System.out.print("=");
			 System.out.print(a);
			 System.out.print("\n");
		}
		for (i = 1; ;i++)
		{
			 if (a % 2 == 0)
			 {
				 b = a / 2;
				 System.out.print(a);
				 System.out.print("/");
				 System.out.print(2);
				 System.out.print("=");
				 System.out.print(b);
				 System.out.print("\n");
				 a = b;
			 }
			 else
			 {
				   b = a * 3 + 1;
				   System.out.print(a);
				   System.out.print("*");
				   System.out.print(3);
				   System.out.print("+");
				   System.out.print(1);
				   System.out.print("=");
				   System.out.print(b);
				   System.out.print("\n");
				   a = b; //??????
			 }
			 if (a == 1)
			 {
				break; //????1??????
			 }
		}
		System.out.print("End");
		System.out.print("\n");
		}
		else
		{
			  System.out.print("End");
			  System.out.print("\n");
		}
		return 0;
	}

}

