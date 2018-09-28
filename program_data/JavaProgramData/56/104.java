package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int r = 0;
		int t = n;
		int a;
		int tmp;
		do
		{
			t = (int)(t / 10);
			r++;
		}while (t > 0);
		for (i = 0;i < r;i++)
		{
			t = n / (int)Math.pow(10,i);
			a = t % 10;
			System.out.printf("%d",a);
		}
		return 0;
	}
}

