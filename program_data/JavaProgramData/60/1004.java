package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int change(int[][] sz, int n);
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		int add = 0;
		int shu;
		int add1 = 0;
		int add2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n + 1;i++)
		{
			a = Math.pow(i,0.5);
			for (j = 2;j < a + 1;j++)
			{
				if (i % j == 0)
				{
					add++;
				}
			}
			if (add == 0)
			{
				add1++;
				if (add1 == 1)
				{
					shu = i;
				}
				else
				{
					if (i - shu == 2)
					{
						System.out.printf("%d %d\n",shu,i);
					}
					add2++;
				}
				shu = i;
			}
			add = 0;
		}
		if (add2 == 0 || n == 2 || n == 3)
		{
			System.out.print("empty\n");
		}
	}

}

