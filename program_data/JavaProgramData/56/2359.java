package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 10;i++)
		{
			t = (int)Math.pow(10,i);
			if (n / t < 1)
			{
				m = i;
				break;
			}
		}
		t = 0;
		for (i = 0;i < m;i++)
		{
			t = t * 10 + n % 10;
			n = (n - n % 10) / 10;
		}
		System.out.printf("%d",t);
	}


}

