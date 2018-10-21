package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int[] num = new int[100];
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < (n / 2);i++)
		{
			temp = num[i];
			num[i] = num[n - 1 - i];
			num[n - 1 - i] = temp;
		}
		for (i = 0;i < n;i++)
		{
			  if (i != n - 1)
			  {
				 System.out.print(num[i]);
				 System.out.print(" ");
			  }
			  else
			  {
				 System.out.print(num[i]);
			  }
		}
		return 0;
	}
}

