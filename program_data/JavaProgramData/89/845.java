package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] famous = new int[n + 1];
		for (i = 0;i < n;i++)
		{
	   famous[i] = 0;
		}
		int a;
		int b;
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
			break;
			}

			famous[b]++;

		}
		int m = 0;
		for (i = 1;i < n;i++)
		{
			 if (famous[i] == n - 1)
			 {
			 System.out.print(i);
			 m++;
			 }
		}
		if (m == 0)
		{
		System.out.print(0);
		System.out.print("\n");
		}
		return 0;

	}

}

