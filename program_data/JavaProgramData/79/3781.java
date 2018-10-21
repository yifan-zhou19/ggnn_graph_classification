package <missing>;

public class GlobalMembers
{
	public static void p_king(int m,int n)
	{
		int i;
		int j;
		int k;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = a + 1,i = 1;p <= a + n; * p++=i++)
		{
			;
		}
		for (i = 0,j = 0,k = 0,p = a;k < n - 1;)
		{
			i = i % n + 1;
			if (*(p + i) != 0)
			{
				j++;
				if (j % m == 0)
				{
					k++;
					*(p + i) = 0;
				}
			}
		}
		for (i = 1;;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf("%d\n",a[i]);
			break;
			}
		}
	}
	public static void Main()
	{
		int i;
		int[] m = new int[20];
		int[] n = new int[20];
		for (i = 0;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		if (m[i] == 0 && n[i] == 0)
		{
			break;
		}
		}
		for (i = 0;;i++)
		{
			if (m[i] == 0 && n[i] == 0)
			{
				break;
			}
			p_king(m[i], n[i]);
		}
	}

}

