package <missing>;

public class GlobalMembers
{
	//??????????
	//??????
	//?????2011-1-8


	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] count = new int[200000];
		int[] check = new int[200000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			  i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if ((i == 0) && (j == 0))
			  {
				  break;
			  }
			  count[j]++; //??j??+1
			  check[i]++; //i????+1
		}
		for (i = 0;i < n;i++)
		{
		  if ((count[i] == n - 1) && (check[i] < n - 1))
		  {
		  System.out.print(i);
		  return 0;
		  } //??????????
		}
		System.out.print("NOT FOUND");
		return 0;
	}

}

