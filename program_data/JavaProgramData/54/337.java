package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,k,m,N;
		int n;
		int i;
		int k;
		int m;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		N = n;
		if (n == 2)
		{
			  m = 8 - k;
			  System.out.printf("%d",m);
		}
		else
		{
			  n = Math.pow(n,n);
			  m = n - (N - 1) * k;
			  System.out.printf("%d",m);
		}
		  return 0;
	}
}

