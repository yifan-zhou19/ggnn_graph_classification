package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[5];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
			if (a != 0)
			{
			n = Math.log10(a) + 1;
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = (int)(a / Math.pow(10,i)) % 10; //??????????
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%d",b[i]); //????
		}
		System.out.print("\n");
			}
			else
			{
				System.out.print("0");
			}
		return 0;
	}

}

