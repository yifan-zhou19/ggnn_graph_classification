package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  int[] s = new int[30];
		  int[] t = new int[30];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  s[i] = Integer.parseInt(tempVar2);
						  }
						  t[i] = 0;
		  }
		  for (i = k - 1;i >= 0;i--)
		  {
						   for (j = i + 1;j < k;j++)
						   {
											 if (s[i] >= s[j] != 0 && t[i] < t[j])
											 {
														 t[i] = t[j];
											 }
						   }
						   t[i]++;
		  }
		  for (i = 0;i < k;i++)
		  {
						  if (t[0] < t[i])
						  {
							 t[0] = t[i];
						  }
		  }
		  System.out.printf("%d",t[0]);
	}


}

