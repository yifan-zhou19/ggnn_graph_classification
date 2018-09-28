package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[100001];
	  int k;
	  int i;
	  int j;
	  int num = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] == k)
		{
		  num++;
		  for (j = i;j < n;j++)
		  {
		  a[j] = a[j + 1];
		  }
		}
		 if (a[i] == k)
		 {
		 i--;
		 }
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < (n - num);i++)
	  {
	   System.out.printf(" %d",a[i]);
	  }
	}
}

