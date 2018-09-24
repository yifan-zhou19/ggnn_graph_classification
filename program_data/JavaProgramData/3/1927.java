package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			for (int z = 0;z < n;z++)
			{
				for (j = z + 1;j < n;j++)
				{
					if (a[z] + a[j] == k)
					{
						s = 1;
						break;
					}
				}
						if (a[z] + a[j] == k)
						{
							break;
						}

			}
					 if (s == 1)
					 {
						 System.out.print("yes");
					 }
					else if (s == 0)
					{
					System.out.print("no");
					}

					return 0;
	}

}

