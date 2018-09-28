package <missing>;

public class GlobalMembers
{
	public static void hou(int n,int m)
	{


		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int k = 0;
		int o = 0;

		p = a + 1;
		for (i = 1;i <= n;i++)
		{
			*(p++) = i;
		}
		p = a + 1;
		while (o < n - 1)
		{

			if (*p != 0)
			{
				k++;
			}
			if (k == m)
			{
				*p = 0;
				k = 0;
				o++;
			} //*???N???????????N?????
			if (p < a + n)
			{
				p++;
			}
			else
			{
				p = a + 1;
			}
		}

		p = a + 1;
		while (*p == 0)
		{
			p++;
		}
		System.out.printf("%d\n",*p);
	}

	public static void Main()
	{
		int[][] a = new int[20][2];
		int i;
		int j;
		for (i = 0;i < 20;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			if ((a[i][0] == 0) && (a[i][1] == 0))
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			hou(a[j][0], a[j][1]);
		}
	}


}

