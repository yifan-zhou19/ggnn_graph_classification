package <missing>;

public class GlobalMembers
{
	public static int Reverse(int n)
	{
		double Sum = 0; //???????
		int i = 0; //?????i
		int k = 0; //????k
		int[] a = {10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //??????????????
		for (i = 0;i < 100;i++) //????
		{
			if (n / Math.pow(10.0,i) < 1 && n / Math.pow(10.0,i)>-1)
			{
			   break;
			}
		}

		for (k = 0;k < i;k++) //?????????????
		{
			a[i - k] = n / Math.pow(10.0,i - k - 1);
		  n -= a[i - k] * (Math.pow(10.0,i - k - 1));
		}
		for (k = 1;k <= i;k++) //????????
		{
			Sum += a[k] * Math.pow(10.0,i - k);
		}
	   return Sum;
	}
	public static int Main()
	{
		int i = 0; //?????i
		double Num = 0; //???????Num
		for (i = 0;i < 6;i++) //???????
		{
			  Num = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Reverse(Num));
			System.out.print("\n");
		}
	return 0;
	}


}

