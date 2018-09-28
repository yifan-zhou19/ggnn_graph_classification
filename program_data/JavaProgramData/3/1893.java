package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????n(n<1000)?????????????????????k?
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i; //??
		int j;
		int yes = 0; //??????
		for (i = 0;i < n;i++)
		{
						a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??n???
		for (i = 0;i < n;i++)
		{
						for (j = i + 1;j < n;j++)
						{
										  if (a[i] + a[j] == k)
										  {
														   yes = 1;
										  }
						}
		}
		if (yes == 0)
		{
				  System.out.print("no");
		} //??????????k???no
		if (yes == 1)
		{
				  System.out.print("yes");
		} //??????????k???yes
		return 0;
	}

}

