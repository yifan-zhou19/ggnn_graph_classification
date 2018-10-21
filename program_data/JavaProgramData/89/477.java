package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int[] i = new int[65534];
		  int[] j = new int[65534];
		  int[] count1 = new int[10000];
		  int[] count2 = new int[10000];
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (k = 0;;k++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  i[k] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  j[k] = Integer.parseInt(tempVar3);
			  }
			  if ((i[k] == 0) && (j[k] == 0))
			  {
			  break;
			  }
			  for (m = 0;m < n;m++)
			  {
				 if (i[k] == m)
				 {
				 count1[m]++;
				 }
				 else if (j[k] == m)
				 {
				 count2[m]++;
				 }
			  }
		  }
		  for (m = 0;m < n;m++)
		  {
			 if ((count1[m] == 0) && (count2[m] == n - 1))
			 {
			  System.out.printf("%d",m);
			  break;
			 }
		  }
		  if (m == n)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}
}

