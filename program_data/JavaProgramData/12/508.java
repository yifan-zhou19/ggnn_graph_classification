package <missing>;

public class GlobalMembers
{
	//* ??   *
	//* author:??? *
	//* time : 10.19  *



	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int n = 0;
		do
		{
			for (i = 0; i <= 15; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[0] == -1)
				{
					break;
				}
				if (a[i] == 0)
				{
					break;
				}
			}
					  if (a[0] == -1)
					  {
						   break;
					  }
			for (j = 0; j <= i - 1; j++)
			{
				for (k = 0; k <= i - 1; k++)
				{
					if (a[j] == 2 * a[k])
					{
						n++;
					}
				}
			}
				System.out.print(n);
				System.out.print("\n");
				n = 0;
		}while (1 != 0);
		return 0;
	}



}

