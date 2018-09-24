package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void move(int num[],int m,int n);
		int[] num = new int[100];
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		move(num, m, n);
		System.out.printf("%d",num[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",num[i]);
		}
		System.out.print("\n");
	}
	public static void move(int[] num, int m, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int end;
		end = num[m - 1];
		for (p = num + m - 1;p > num;p--)
		{
			*p = (p - 1);
		}
		num[0] = end;
		n--;
		if (n > 0)
		{
			move(num, m, n);
		}
	}

}

