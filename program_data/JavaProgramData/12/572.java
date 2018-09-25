package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int j;
		int i;
		int[] a = new int[16];
		int m = 0;
		do
		{
			for (i = 0;i <= 15;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n++;
			if (a[i] == 0)
			{
				break;
			}
			if (a[i] == (-1))
			{
				break;
			}
			}
					  if (a[0] == -1)
					  {
						  break;
					  }
			for (j = 0;j < n;j++)
			{
				for (k = j + 1;k < n;k++)
				{
					if (a[j] == a[k] * 2 || a[k] == a[j] * 2)
					{
						m++;
					}
				}
			}
			System.out.print(m);
			System.out.print("\n");
			m = 0;
			n = 0;
		}while (a[0] != (-1));
		return 0;
	}




}

