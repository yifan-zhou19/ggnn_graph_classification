package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s = 0;
	int a;
	int b;
	int c;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1;i <= n;i++)
	{
		a = i % 7;
		b = i % 10;
		c = i / 10;
		 if (a != 0)
		 {
			 if (b != 7)
			 {
				 if (c != 7)
				 {
				   s = s + i * i;
				 }
			 }
		 }

	}
	System.out.print(s);
	System.out.print("\n");
	return 0;
	}
}

