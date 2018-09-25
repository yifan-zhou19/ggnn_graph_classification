package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int k;
		int m;
		int n;
		int[] num = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (i = 0;i < 100;i++)
		{
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
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				p = num;
				for (j = 0;j < n;j++)
				{
					*(p + j) = j + 1;
				}
				j = 0;
				k = 0;
				t = 0;
				while (t < n - 1)
				{
					if (*(p + j) != 0)
					{
						k++;
					}
					if (k == m)
					{
						*(p + j) = 0;
						k = 0;
						t++;
					}
					j++;
					if (j == n)
					{
						j = 0;
					}
				}
				while (*p == 0)
				{
					p++;
				}
				System.out.printf("%d\n",*p);
			}
		}
	}
}

