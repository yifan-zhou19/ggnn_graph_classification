package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] shu = new int[n];
		for (int i = 0;i < n;i++)
		{
		shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		  if (shu[i] == k)
		  {
			sum = sum + 1;
			for (int j = i;j < n;j++)
			{
			  shu[j] = shu[j + 1];
			}
			i = i - 1;
		  }
		}
		for (int i = 0;i < n - sum;i++)
		{
		  if (i == 0)
		  {
		  System.out.print(shu[i]);
		  }
		  if (i > 0)
		  {
		  System.out.print(" ");
		  System.out.print(shu[i]);
		  }
		}
		return 0;
	}

}

