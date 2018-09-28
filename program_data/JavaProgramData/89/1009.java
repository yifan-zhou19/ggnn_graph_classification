package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int l;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] b = new int[n];
	 int[] c = new int[n];
	 while (j < n)
	 {
	  b[j] = 0;
	  c[j] = 0;
	  j++;
	 }
	 j = 0;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 l = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 b[l]++;
	 c[m]++;
	 i++;
	 while ((l + m) != 0)
	 {
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  l = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  m = Integer.parseInt(tempVar5);
	  }
	  b[l]++;
	  c[m]++;
	  i++;
	 }
	 i--;
	 b[0]--;
	 c[0]--;
	 while (j < n)
	 {
	  if (b[j] == 0 && c[j] == n - 1)
	  {
	   System.out.printf("%d",j),j = n,k++;
	  }
	  j++;
	 }
	 if (k == 0)
	 {
	  System.out.print("NOT FOUND");
	 }
	}


}

