package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????? **
	//*?????1300062805 **
	//*???2013.11.2 **
	//********************************
	public static int[] a = new int[1001];
	public static int Main()
	{
		int i;
		int x;
		int y;
		int k = 1;
		int j = 0;
		int sum = 0;
		for (i = 1; ;i++) // ??????????????????
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[x]++;
			if (System.in.read() != ',')
			{
			  k = i; //??????
			  break;
			}
		}
		   for (i = 1; ;i++) // ??????????????????
		   {
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[y]--;
		  if (System.in.read() != ',')
		  {
			  break;
		  }
		   }
		  for (i = 0; i <= 1000; i++) //?????????????????????
		  {
			sum = sum + a[i];
			if (sum >= j)
			{
			  j = sum;
			}

		  }
			System.out.print(k);
			System.out.print(" ");
			System.out.print(j);
			System.out.print("\n");
		   return 0;
	}
}

