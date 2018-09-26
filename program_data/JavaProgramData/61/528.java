package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long f[25]={0};
		int[] f = new int[25];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		f[0] = 1;
		f[1] = 1;
		for (i = 2;i < 20;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}


		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f[a[i] - 1]);
		}
		return 0;
	}



}

