package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j = 0;
		int num;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 a[j] = a[i];
			 j++;
		}
		for (i = 0;i < n;i++)
		{
			 for (j = i + 1;j < n;j++)
			 {
				  if (a[i] + a[j] == k)
				  {
					 num = 1;
				  }
				  else
				  {
					  num = 0;
				  }
				  sum = sum + num;
			 }
		}
		if (sum == 0)
		{
		   System.out.print("no");
		   System.out.print("\n");
		}
		else
		{
			 System.out.print("yes");
			 System.out.print("\n");
		}
		return 0;
	}

}

