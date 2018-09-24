package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int n;
		int k;
		int i;
		int sum;
		int p;
		int q;
		int control = 0; //?????????control
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????????
		for (p = 1;p <= n;p++)
		{
				for (q = n;q > p;q--) //?????1?n??????n????1???????????????
				{
					sum = a[p] + a[q]; //????sum
				 if (sum == k) //??????k
				 {
						 control = 1; //??????
					  break;
				 } //??????
				}
		}
		if (control == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}




		return 0;
	}
}

