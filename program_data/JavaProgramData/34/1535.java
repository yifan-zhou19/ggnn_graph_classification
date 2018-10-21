package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 1)
		{
			do
			{
		 if (n % 2 == 0)
		 {
			   m = n / 2;
		 System.out.print(n);
		 System.out.print("/2=");
		 System.out.print(m);
		 System.out.print("\n");
		 n = m;
		 }
		 else
		 {
			m = n * 3 + 1;
		 System.out.print(n);
		 System.out.print("*3+1=");
		 System.out.print(m);
		 System.out.print("\n");
		 n = m;
		 }
			} while (n != 1);
		System.out.print("End");
		}
		else
		{
			System.out.print("End");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

