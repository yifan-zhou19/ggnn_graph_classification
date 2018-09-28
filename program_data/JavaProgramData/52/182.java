package <missing>;

public class GlobalMembers
{
	//????????????
	public static void move(int[] num, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int end;
		int j;
		end = num[n - 1];
		for (j = 1;j <= m;j++)
		{

			end = num[n - 1];
			for (p = num + n - 1;p > num;p--)
			{
				*p = (p - 1);
			}
				num[0] = end;
		}

	}
	/*void move(int num[30],int n,int m)
	{
		int *p;
		int end;
		end=*(num+n-1);
		for(p=num+n-1;p>num;p--)
		{
			*p=*(p-1);
		}
			*num=end;
		m--;
		if(m>0)
		{
			move(num,n,m);
		}
	
	}*/

	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[30];
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
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		move(a, n, m);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

