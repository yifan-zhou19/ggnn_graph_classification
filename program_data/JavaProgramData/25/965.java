package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		int n;
		int i;
		int j;
		int carry;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 1;i <= n;i++)
		{
			carry = 0;
			for (j = 0;j < 49;j++)
			{
				temp = Math.floor(a[j] * 2 / 10);
				a[j] = (a[j] * 2) % 10;
				a[j] += carry;
				carry = temp;
			}
		}
		temp = 0;
		for (i = 0;i < 49;i++)
		{
			if (a[i] != 0)
			{
				temp = i;
			}
		}
		for (j = temp;j >= 0;j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

