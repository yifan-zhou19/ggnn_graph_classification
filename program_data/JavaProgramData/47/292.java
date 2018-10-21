package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int[] in = new int[100];
		int[] out = new int[100];
		for (i = 0;i < n;i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = n - 1;i<n,j >= 0;i++,j--)
		{
			out[j] = in[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(out[i]);
			System.out.print(" ");
		}
		System.out.print(out[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

