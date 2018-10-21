package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] l = new int[1000];
		int sum;
		char[][] a = new char[1000][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 1;i <= n;i++)
		{
			l[i] = String.valueOf(*(a + i)).length();
		}
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			for (j = i;j <= n;j++)
			{
				if (sum + l[j] > 80)
				{
					break;
				}
				else
				{
				  sum += l[j] + 1;
				}
			}
			if (i == n)
			{
				System.out.print((a + n));
				System.out.print("\n");
			}
			else
			{
			  for (k = i;k < j - 1;k++)
			  {
				System.out.print((a + k));
				System.out.print(' ');
			  }
			  System.out.print((a + j - 1));
			  System.out.print("\n");
			}
			i = j - 1;
		}
		return 0;
	}


}

