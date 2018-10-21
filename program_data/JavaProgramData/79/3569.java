package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[100];
	 int[] b = new int[100];
	 int num = 0;
	 int i;
	 int j;
	 int n = 0;
	 for (i = 0;i < 100;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b[i] = Integer.parseInt(tempVar2);
	 }
	 if (a[i] == 0 && b[i] == 0)
	 {
	  n = i;
	 break;
	 }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 2;j <= a[i];j++)
	  {
	  num = (num + b[i]) % j;
	  }
	  if (i < n - 1)
	  {
	  System.out.printf("%d\n",num + 1);
	  }
	  if (i == n - 1)
	  {
	  System.out.printf("%d",num + 1);
	  }
	  num = 0;
	 }
	 return 0;
	}
}

