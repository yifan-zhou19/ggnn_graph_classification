package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int k;
		int n;
		int[] a = new int[10];
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		while (k > 0)
		{
			a[i] = k % 10; //???????
			k = k / 10;
			i++;
			j++; //????
		}
		if (n == 0)
		{
			a[0] = 0;
			j = 1;
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

