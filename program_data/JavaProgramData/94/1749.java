package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		return x % 2;
	}

	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		  int i;
		  int j = 0;
		  int n;
		  int x;
		  int[] b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  b = new int[n];
		  for (i = 0;i < n;i++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   x = Integer.parseInt(tempVar2);
			   }
			   if (f(x) != 0)
			   {
				   b[j] = x;
				   j++;
			   }
		  }
		  qsort(b,j,(Integer.SIZE / Byte.SIZE),cmp);
		  for (i = 0;i < j - 1;i++)
		  {
			  System.out.printf("%d,",b[i]);
		  }
		  System.out.printf("%d",b[i]);

	}

}

