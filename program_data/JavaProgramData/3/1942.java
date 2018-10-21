package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //n?????? k?? ??l???????????
	int k;
	int l = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] s = new int[n];
	   for (int i = 0;i <= n - 1;i++)
	   {
	   s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (int i = 0;i <= n - 2;i++)
	   {
		   for (int j = i + 1;j <= n - 1;j++)
		   {
			 if (l == 0)
			 {
					 if (s[i] + s[j] == k)
					 {
				 System.out.print("yes");
				 l = l + 1;
					 }
			 }
		   }
	   }
	if (l == 0)
	{
	System.out.print("no");
	}
	return 0;
	}

}

