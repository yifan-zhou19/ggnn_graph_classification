package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(a,0,(Integer.SIZE / Byte.SIZE));
		  for (;;)
		  {
				 int x;
				 int y;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 x = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 y = Integer.parseInt(tempVar3);
				 }
				 if (x == 0 && y == 0)
				 {
					 break;
				 }
				 a[x]--;
				 a[y]++;
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
				 if (a[i] == n - 1)
				 {
					 System.out.printf("%d",i);
				 }
		  }
	}
}

