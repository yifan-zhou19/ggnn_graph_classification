package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????n?????i?j?k??????num
		int i;
		int j = 1;
		int p;
		int num;
		int k;
		int[] a = new int[500]; //????a?????0
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //????
		{
						 num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 if (num % 2 != 0) //?????????
						 {
						 a[j++] = num; //????????????
						 }
		}
		j = j - 1; //?j?????????
		for (k = 1;k <= j - 1;k++) //???????xunhuan
		{
						   for (i = 1;i <= j - k;i++) //????
						   {
											  if (a[i] > a[i + 1])
											  {
															 p = a[i];
															 a[i] = a[i + 1];
															 a[i + 1] = p; //?a[i]?a[i+1]??
											  }
						   }
		}
		for (i = 1;i <= j;i++)
		{
						 if (i != j)
						 {
						 System.out.print(a[i]);
						 System.out.print(",");
						 }
						 else
						 {
						 System.out.print(a[i]);
						 }
		}
		return 0;
	}

}

