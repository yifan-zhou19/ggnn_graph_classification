package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int ans;
	int n = 0;
	//char c;	
	int reverse = int num;
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ans = reverse(n);
		System.out.printf("%d\n",ans);
	}
	}

	public static int reverse(int num)
	{
	int m = 0;
	int flag = 1;
	int w;
	if (num < 0)
	{
		flag = 0;
		num = -num;
	}
	w = (int)Math.log10(num);
	for (;w >= 0;w--)
	{
		m = m * 10 + num % 10;
		num = num / 10;
	}
	if (flag == 0)
	{
		m = -m;
	}
	return m;
	}
}

