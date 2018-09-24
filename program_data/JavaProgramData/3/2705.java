package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001];
	public static int n;
	public static int comp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int findx(int l,int r,int key)
	{
		if (l > r)
		{
			return 0;
		}
		if (r == l)
		{
				 if (a[r] == key)
				 {
				 return 1;
				 }
				 else
				 {
				 return 0;
				 }
		}
		if (a[(r + l) / 2] == key)
		{
							 return 1;
		}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
							 else if (a[(r + l) >> 1] < key)
							 {
								  return findx(((r + l) / 2) + 1, r, key);
							 }
							 else
							 {
							 return findx(l, ((r + l) / 2) - 1, key);
							 }
	}

	public static int Main()
	{
		int i;
		int k;
		//freopen("1.txt","r",stdin);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		qsort(a + 1,n,(Integer.SIZE / Byte.SIZE),comp);
		for (i = 1;i < n;i++)
		{
		if (findx(i + 1, n, k - a[i]) != 0)
		{
							 System.out.print("yes");
							 return 0;
		}
		}
		System.out.print("no");
	   //getch();   
		return 0;
	}

}

