package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a = 1;
	  int n;
	  int k;
	  int[] i = new int[100001];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (a = 1;a <= n;a++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  i[a] = Integer.parseInt(tempVar2);
		  }
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  for (a = 1;a <= n;)
	  {
			 while (i[a] == k)
			 {
				 a++;
			  if (i[a] != k)
			  {
				  break;
			  }
			 }
			 System.out.printf("%d",i[a]);
			 a = a + 1;
			 for (;a <= n;a++)
			 {
			 if (i[a] != k)
			 {
				 System.out.printf(" %d",i[a]);
			 }
			 }
	  }
	  return (0);
	}
}

