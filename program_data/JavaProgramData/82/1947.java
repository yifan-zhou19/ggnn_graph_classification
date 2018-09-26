package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int t = 0;
		int i = 1;
		int h = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				h = Math.max(i - t, h);
			}
			else
			{
				t = i;
			}
			i++;
		}while (i <= n);
		System.out.print(h);
		System.out.print("\n");
		return 0;
	}

}

