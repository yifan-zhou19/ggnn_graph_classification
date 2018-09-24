package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //a?????,b?????
		int i = 0;
		int a = 0;
		int b = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = i % 10;
			b = i / 10;
			if (i % 7 != 0 && a != 7 && b != 7)
			{
				sum = sum + i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

