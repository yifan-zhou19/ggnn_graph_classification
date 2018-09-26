package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] p = new int[n];
		  for (i = 0;i < n;i++)
		  {
						  p[i] = 0;
		  }
		  for (;;)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 i = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 j = Integer.parseInt(tempVar3);
				 }
				 if (i == 0 && j == 0)
				 {
					 break;
				 }
				 else
				 {
					 p[j]++;
					 p[i] = -n;
				 }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (p[i] == n - 1)
						  {
							  System.out.printf("%d",i);
						  }
		  }

	}
}

