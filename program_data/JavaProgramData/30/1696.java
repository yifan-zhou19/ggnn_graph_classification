package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			b = i % 7;
			c = i / 10;
			d = i % 10;
			if (b != 0 && c != 7 && d != 7)
			{
				a = a + i * i;
			}
		}
		System.out.print(a);
		System.out.print("\n");
	  return 0;
	}

}

