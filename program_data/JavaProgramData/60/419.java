package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int tag = 1;
		if (x == 2)
		{
			return 1;
		}
		else if (x == 1)
		{
			return 0;
		}
		else
		{
			for (i = 2;i < x;i++)
			{
			 if (x % i == 0)
			 {
				 tag = 0;
				 break;
			 }
			}
			 return tag;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (f(i) != 0 && f(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				num++;
			}
		}
			if (num == 0)
			{
				System.out.print("empty\n");
			}
	}


}

