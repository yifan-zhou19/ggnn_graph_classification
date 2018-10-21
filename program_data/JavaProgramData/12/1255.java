package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i = 0;
		int n = 0;
		int j;
		int k;
		int m;
		for (m = 1; ; m++)
		{
			i = 0;
			n = 0;
			while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
			   if (a[i] == 0 || a[i] == -1)
			   {
				   break;
			   }
			   else
			   {
				   i++;
			   }
			}
			if (a[0] == -1)
			{
				break;
			}
			for (j = 0; j < i - 1; j++)
			{
				for (k = j + 1; k <= i - 1; k++)
				{
					if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
					{
						n++;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}
}

