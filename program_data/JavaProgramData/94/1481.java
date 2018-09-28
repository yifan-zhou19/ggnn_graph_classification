package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[M];
		int[] odd = new int[M];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int m = 0;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = c;
		q = odd;
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			if (*p % 2 != 0)
			{
				*q = p;
				q++;
				m++;
			}
		}
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (odd[i] > odd[i + 1])
				{
					temp = odd[i];
					odd[i] = odd[i + 1];
					odd[i + 1] = temp;
				}
			}
		}
		System.out.printf("%d",odd[0]);
		for (i = 1;i < m;i++)
		{
		System.out.printf(",%d",odd[i]);
		}

		return 0;
	}






}

