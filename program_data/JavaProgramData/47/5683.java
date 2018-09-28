package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		int[] arrey = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			arrey[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			p = arrey[i];
			arrey[i] = arrey[j];
			arrey[j] = p;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(arrey[i]);
			System.out.print(" ");
		}
		System.out.print(arrey[n - 1]);
		System.out.print("\n");
		return 0;
	}

}

