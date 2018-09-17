public class daodan
{
	public int height;
	public int number;
}

package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		daodan x = (daodan)a;
		daodan y = (daodan)b;
		return ((y.number) - (x.number));
	}
	public static int nextmax(daodan[] dao, int k, int n)
	{
		int[] a = new int[(n - 1 - k)];
		int count = 0;
		int b;
		int c = 0;
		for (int i = k + 1;i <= n - 1;i++)
		{
			if ((dao[i]).height <= (dao[k]).height)
			{
				a[count] = dao[i].number;
				count++;
			}
			/*else if((dao[i].height)==dao[k].height)
			{
			    b=dao[i].number;
			    c++;
			}
			*/
		}
		int max = 0;
		for (int j = 0;j <= count - 1;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
			}
		}
		/*if(max==b)
		{
		    return max+c;
		}
		else
		{
		    return max;
		}
		*/
		return max;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		daodan[] dao = tangible.Arrays.initializeWithDefaultdaodanInstances(n);
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dao[i].height = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j <= n - 1;j++)
		{
			dao[j].number = 1;
		}
		for (int k = n - 2;k >= 0;k--)
		{
			dao[k].number = nextmax(dao, k, n) + 1;
		}
		int max = dao[0].number;
		for (int l = 1;l <= n - 1;l++)
		{
			if (dao[l].number > max)
			{
				max = dao[l].number;
			}
		}
		System.out.printf("%d",max);
	}

}

