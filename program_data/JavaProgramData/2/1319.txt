package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int x;
	//		char z[10];
	//	}
	//	a[400];
		int i;
		int n;
		int max = 0;
		int j;
		int k;
		int l;
		int[] y = new int[400];
		int p;
		char u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].z = tempVar3;
		}
		y[i] = String.valueOf(a[i].z).length();
	}
	for (i = 0;i < n - 1;i++)
	{

	for (j = 0;j < y[i];j++)
	{
		p = 1;
		for (k = i + 1;k < n;k++)
		{
			for (l = 0;l < y[k];l++)
			{
				if (a[i].z[j] == a[k].z[l])
				{
					p++;
				}
			}
		}
		if (p > max)
		{
			max = p;
			u = a[i].z[j];
		}
	}
	}
	System.out.printf("%c\n%d\n",u,max);
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < y[i];j++)
		{
			if (u == a[i].z[j])
			{
			System.out.printf("%d\n",a[i].x);
			break;
			}
		}
	}
	}


}

