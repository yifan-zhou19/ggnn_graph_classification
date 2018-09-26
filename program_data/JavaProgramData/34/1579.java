package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (n == 1)
			 {
				 System.out.print("End");
			 }
			 else
			 {
		do
		{
			if (n % 2 == 1)
			{
				temp = n; //????n??????
				n = n * 3 + 1;
				System.out.print(temp);
				System.out.print("*3+1=");
				System.out.print(n);
				System.out.print("\n");
			}
			else
			{
				temp = n; //????n??????
				n = n / 2;
				System.out.print(temp);
				System.out.print("/2=");
				System.out.print(n);
				System.out.print("\n");
			}
		} while (n != 1);
			 System.out.print("End");
			 }
		return 0;
	}

}

