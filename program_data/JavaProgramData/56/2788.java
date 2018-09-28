package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int i;
		int k;
		int s;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 5;i++)
		{
			a[i] = s % 10;
			s = s / 10;
			if (s == 0)
			{
				k = i;
				break;
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

