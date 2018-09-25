package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			k = 0;
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					k++;
				}
			}
				if (k == 0 && i != 0)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}

		}
			return 0;
	}


}

