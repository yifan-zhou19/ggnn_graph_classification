package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int t;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
			t = w + 12;
			t = t % 7;
			if (t == 0)
			{
				t = 7;
			}
			else
			{
				t = t;
			}
			if (t == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			w = w + a[i] - 1;
			w = w % 7 + 1;
		}
		return 0;
	}



}

