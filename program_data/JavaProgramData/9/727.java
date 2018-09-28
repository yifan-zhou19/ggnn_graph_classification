package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] b = new int[100];
		int[] c = new int[100];
		int j = 0;
		int k;
		int mid;
		int p;
		int m = 0;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[20];
	//		int age;
	//	}
	//	a[100];
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
			a[i].id = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].age = tempVar3;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				b[j++] = i;
			}
			else
			{
				c[m++] = i;
			}
		}
		for (i = 0;i < j;i++)
		{
		max = i;
			for (k = i;k < j;k++)
			{

				if (a[b[k]].age > a[b[max]].age)
				{
					max = k;
				}
			}
			mid = b[max];
			for (k = max;k > i;k--)
			{
			b[k] = b[k - 1];
			}
			b[i] = mid;
		}
		for (i = 0;i < j;i++)
		{
		System.out.printf("%s\n",a[b[i]].id);
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%s\n",a[c[i]].id);
		}
	}
}

