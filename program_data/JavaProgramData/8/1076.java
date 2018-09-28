package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *pfCompare(const Object* a, const Object* b)
	public static int pfCompare(Object a, Object b)
	{
	   return *(int)a - (int)b;
	}
	public static int shuru(int x,int y)
	{
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	int[] p = new int[x];
	for (k = 0;k <= x - 1;k++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p[k] = Integer.parseInt(tempVar3);
	}
	}
	int[] q = new int[y];
	for (k = 0;k <= y - 1;k++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		q[k] = Integer.parseInt(tempVar4);
	}
	}
	qsort(p,x,(Integer.SIZE / Byte.SIZE),pfCompare);
	qsort(q,y,(Integer.SIZE / Byte.SIZE),pfCompare);
	int[] c = new int[(x + y)];
	  for (k = 0;k <= x - 1;k++)
	  {
	  c[k] = p[k];
	  }
	  for (k = 0;k <= y - 1;k++)
	  {
	  c[x + k] = q[k];
	  }
	  for (k = 0;k <= x + y - 2;k++)
	  {
	  System.out.printf("%d ",c[k]);
	  }
	  System.out.printf("%d",c[x + y - 1]);
	}

	public static int Main()
	{
	shuru(n, m);
	}
}

