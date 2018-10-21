package <missing>;

public class GlobalMembers
{
	/*
	?????7???????
	??????
	?????2011.9.4
	*/
	public static int Main()
	{
		int i;
		int n;
		int s;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 100 && n > 0)
		{
			s = 0;
			for (i = 1;i <= n;i++)
			{
				a = i % 7; //a?7?i???
				b = i % 10; //b?i????
				c = i / 10; //c?i????
				if (a == 0 || b == 7 || c == 7)
				{
					s = s;
				}
				else
				{
					s = s + i * i;
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;

	}
}

