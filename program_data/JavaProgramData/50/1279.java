package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int[] b = new int[13];
		int[] c = new int[13];
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b[0] = 12;
		for (i = 1;i < 13;i++)
		{
			b[i] = b[i - 1] + a[i - 1];
		c[i - 1] = b[i - 1] % 7;
		if ((c[i - 1] + w) % 7 == 5)
		{
			System.out.print(i);
			System.out.print("\n");
		}
		}
		 return 0;
	}



}

