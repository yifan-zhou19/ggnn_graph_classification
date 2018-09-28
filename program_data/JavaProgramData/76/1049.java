package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[50001];
		int[] b = new int[50001];
		int count = 0;
		int[] qj = new int[10001];
		int n;
		int amin;
		int bmax = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10001;i++)
		{
			qj[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		for (j = a[i];j < b[i];j++)
		{
			qj[j] = 1;
		}
		}
		amin = a[0];
		for (i = 0;i < n;i++)
		{
		if (amin > a[i])
		{
		amin = a[i];
		}
		}
		for (i = 0;i < n;i++)
		{
		if (bmax < b[i])
		{
		bmax = b[i];
		}
		}
		for (i = amin;i < bmax;i++)
		{
		if (qj[i] == 0)
		{
		count = 1;
		}
		}
		if (count == 0)
		{
			System.out.printf("%d %d\n",amin,bmax);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;


	}
}

