package <missing>;

public class GlobalMembers
{
	public static void f()
	{
	 int a = 0;
	 int i;
	 int j;
	 int m;
	 int n;
	 (int)(*p)[100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (int [100])malloc(m * 100 * (Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   *(p + i) + j = tempVar3;
	   }
	  }
	 }
	 for (j = 0;j < n;j++)
	 {
	  a = a + *(*p + j) + *(*(p + m - 1) + j);
	 }
	 for (i = 1;i < m - 1;i++)
	 {
	  a = a + *(*(p + i)) + *(*(p + i) + n - 1);
	 }
	 System.out.printf("%d\n",a);
	}
	public static void Main()
	{
	 int c;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (c = 0;c < k;c++)
	 {
	  f();
	 }
	}

}

