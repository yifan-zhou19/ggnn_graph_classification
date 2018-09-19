package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n;
		c = n;
		if (n < 10)
		{
		System.out.print(n);
		}
		else
		{
		int length = 1;
		int k = 10;
	   while ((c / k) != 0)
	   {
		  length++;
		  k = k * 10;
	   }
		for (int i = 1;i <= length;i++)
		{
			System.out.print(b % 10);
			b = (b - b % 10) / 10;

		}
		}
		return 0;
	}
}

