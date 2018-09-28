package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] num = new int[100];
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i > n - m - 1;i--)
		{
			temp = num[n - 1 - i + n - m];
			for (j = n - 2 - i + n - m;j >= n - 1 - i;j--)
			{
				num[j + 1] = (num + j);
			}
			num[n - 1 - i] = temp;
		}
		p = num;
		for (;p - num <= n - 1;p++)
		{
		 System.out.printf("%d", p);
		 if (p - num == n - 1)
		 {
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print(" ");
		 }
		}
	}

}

