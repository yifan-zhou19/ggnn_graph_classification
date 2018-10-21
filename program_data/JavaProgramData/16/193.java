package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[10];
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 0)
	  {
		  System.out.print("0\n");
		  return 0;
	  }
	  for (i = 1;n > 0;i++)
	  {
		a[i] = n % 10;
		n = n / 10;
	  }
	   for (j = 1;j <= i - 1;j++)
	   {
	   System.out.printf("%d",a[j]);
	   }
	//   scanf("%d",&n);
	   return 0;
	}

}

