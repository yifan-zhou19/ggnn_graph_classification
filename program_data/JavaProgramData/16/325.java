package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int i = 0;
		int b = n;
		int j;
		do
		{
			b = b / 10;
			i++;
		} while (b != 0);
		for (j = 0;j < i;j++)
		{
			a[j] = n % 10;
			n = n / 10;
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

