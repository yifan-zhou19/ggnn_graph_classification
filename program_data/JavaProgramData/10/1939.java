package <missing>;

public class GlobalMembers
{
	public static int com(Object a, Object b)
	{
		return ((int)a - (int)b);
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[30];
	   int[] s = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }
	   for (int i = n - 2;i >= 0;i--)
	   {
		for (int j = n - 1;j > i;j--)
		{
		 if (a[i] >= a[j])
		 {
		  s[i] = Math.max(s[j] + 1,s[i]);
		 }
		}
	   }
	   qsort(s,30,(Integer.SIZE / Byte.SIZE),com);
	   System.out.printf("%d",s[29] + 1);
	   System.in.read();
	   System.in.read();
	}

}

