package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n];
		int i;
		int a;
		for (i = 0;i < n;i++)
		{
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = a;
		}
		for (i = (n - 1);i >= 0;i--)
		{
				  if (i > 0)
				  {
					  System.out.print(num[i]);
					  System.out.print(' ');
				  }
			  else
			  {
				  System.out.print(num[i]);
			  }
		}
		return 0;
	}
}

