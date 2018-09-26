package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int i = 0;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a > x)
			{
				y = x;
				x = a;
			}
			else if (a > y)
			{
				y = a;
			}
			i++;
		}while (i < n);
		System.out.printf("%d\n%d\n",x,y);


	}

}

