package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int flag = 0;
	int[] a = new int[1001]; //??a????n???
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= n - 1;i++)
	{
		   for (j = i + 1;j <= n;j++)
		   {
		  if (a[i] + a[j] == k) //???????????????????????k???
		  {
				 System.out.print("yes");
				 System.out.print("\n");
			 flag = 1;
			 break;
		  }
		   }
	   if (a[i] + a[j] == k)
	   {
		  break;
	   }
	}
	if (flag != 1)
	{
	   System.out.print("no");
	   System.out.print("\n");
	}
	return 0;
	}
}

