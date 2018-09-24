package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????                 **
	//*??????  1000012939     **
	//*???2012.11.02             **
	//********************************
	public static int Main()
	{
		int[] a = new int[16];
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			int n = 0;
			int count = 0;
			while (a[n] != 0)
			{
				a[++n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (a[i] == 2 * a[j])
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

