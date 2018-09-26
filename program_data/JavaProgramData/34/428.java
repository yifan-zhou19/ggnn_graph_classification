package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[1000000];
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[0] = n;
	if (n == 1)
	{
		System.out.print("End");
	}
	else
	{
	for (i = 1;i++;)
	{
		if (a[t] % 2 == 0)
		{
			a[t + 1] = a[t] / 2;
			System.out.printf("%d/2=%d\n",a[t],a[t + 1]);
			t++;
		}
		 if (a[t] == 1)
		 {
			 System.out.print("End");
			 break;
		 }
		if (a[t] % 2 != 0)
		{
			a[t + 1] = 1 + a[t] * 3;
			System.out.printf("%d*3+1=%d\n",a[t],a[t + 1]);
			t++;
		}
		if (a[t] == 1)
		{
			System.out.print("End");
			break;
		}
	}
	}



		return 0;
	}

}

