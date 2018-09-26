package <missing>;

public class GlobalMembers
{
	public static int houzi(int n,int k,int i,int d) //???? ?????k?l???????????
	{ //??????number????????

	   if (i == n + 1)
	   {
	   return d;
	   }
	   if (d % (n - 1) != 0)
	   {
		 return 0;
	   }
	   d = n * (d / (n - 1)) + k;
		return houzi(n, k, i + 1, d);
	   //??number 
	}
	public static int Main()
	{
		int n; //????b?????????
		int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int j = 0;
		for (j = 1;;j++)
		{
		   int m;
			int d = j * (n - 1);
		m = houzi(n, k, 1, d);

		if (m != 0)
		{
			System.out.print(m);
			break;
		}
		}

	return 0;
	}

}

