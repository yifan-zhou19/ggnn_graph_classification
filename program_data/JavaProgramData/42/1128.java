package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
			j++;
			}
		}
		if (j == 1)
		{
			for (i = 0;i < n;i++)
			{
			   if (a[i] != k)
			   {
				   System.out.print(a[i]);
				   System.out.print("\n");
			   break;
			   }
			}
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			j--;
			}
			if (j == 1)
			{
				break;
			}

		}
		for (i = n - 1;i >= 0;i--)
		{
			if (a[i] != k)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			break;
			}
		}
		}
		return (0);
	}

}

