package <missing>;

public class GlobalMembers
{
	public static int search(int[] a, int s, int m)
	{
	int low = 1;
	int high = s;
	int mid;

	while (low < high)
	{
	mid = (low + high) / 2;
	if (a[mid] == m)
	{
	return mid + 1;
	}
	if (a[mid] > m)
	{
	low = mid + 1;
	}
	else
	{
	high = mid;
	}
	}
	if (a[low] <= m)
	{
	return low;
	}
	else
	{
	return low + 1;
	}
	}
	public static int Main()
	{
	int n;
	int s = 1;
	int t;
	int k;
	int[] p;
	int[] a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	p = new int[n];
	a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p + i = tempVar2;
		}
	}
	for (int i = 0;i < n;i++)
	{
		a[i] = -1;
	}
	a[1] = p[0];
	for (int i = 0;i < n;i++)
	{
	t = 0;
	k = search(a, s, p[i]);
	if (k > s)
	{
		s++;
	}
	a[k] = p[i];
	}
	System.out.printf("%d\n",s);
	return 0;
	}

}

