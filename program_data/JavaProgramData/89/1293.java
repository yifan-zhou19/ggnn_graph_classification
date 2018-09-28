package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i = 0;
	  int j;
	  int k;
	  int n;
	  int max = 0;
	  int sb;
	  int[] a = new int[20000];
	  int[] b = new int[20000];
	  int[] c = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (true)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 if (a[i] == 0 && b[i] == 0)
		 {
		   break;
		 }
		 else
		 {
		   i++;
		 }
	  }
	  for (j = 0;j < i;j++)
	  {
		  c[b[j]]++;
	  }
	  for (k = 0;k < n;k++)
	  {
		 if (max < c[k])
		 {
			 max = c[k];
			 sb = k;
		 }
	  }
	  if (max == n - 1)
	  {
		 System.out.printf("%d",sb);
	  }
	  else
	  {
		 System.out.print("NOT FOUND");
	  }
	}

}

