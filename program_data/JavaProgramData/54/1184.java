package <missing>;

public class GlobalMembers
{
	/*
	 * ???2.cpp
	 * Created on: 2012-11-9
	 * Author: ???
	 * ??:?????
	 */
	public static int Main()
	{
		int k; //????
		int n;
		int m;
		int i;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n + 1]; //????
		for (x[n] = 1;;x[n]++)
		{
		   t = 0;
		   for (i = n - 1;i >= 0;i--) //????
		   {
			 if ((x[i + 1] * n) % (n - 1) != 0)
			 {
				 break;
			 }
			 else
			 {
				 x[i] = (x[i + 1] * n) / (n - 1) + k;
				   t = t + 1;
			 } //??????????
		   }
		   if (t == n)
		   {
			   break;
		   }
		}
		m = x[0]; //??m
		System.out.print(m);
	return 0; //????
	}

}

