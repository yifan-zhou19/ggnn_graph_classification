package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
		int m;
		int i;
		int j;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (j = 1;j <= m;j++)
		{
		for (i = 1;i < n;i++)
		{
			p = a[n - i];
			temp = p;
			p = a[n - 1 - i];
			a[n - i] = p;
			p = temp;
		}
		}
		for (p = a,i = 0;i < n;p++,i++)
		{
			System.out.printf("%d", p);
			{
		if (i < n - 1)
		{
			System.out.print(" ");
		}
		else
		{
			break;
		}
			}
		}
	}
}

