package <missing>;

public class GlobalMembers
{
	public static int proc(int i)
	{
		int ans;
		if (i % 2 == 1)
		{
			ans = i * 3 + 1;
			System.out.printf("%d*3+1=",i);
		}
		else
		{
			ans = i / 2;
			System.out.printf("%d/2=",i);
		}
		return ans;
	}



	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 1)
		{
			n = proc(n);
			System.out.printf("%d\n",n);
		}
		System.out.print("End");
		return 0;
	}

}

