package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int k;
	  int i;
	  int j;
	  int jude = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  int[] a = new int[n];
	  for (i = 0;i <= n - 1;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a + i = tempVar3;
		}
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = i + 1;j <= n - 1;j++)
		  {
			 if (a[i] + a[j] == k)
			 {
				   jude = 1;
				   break;
			 }
		  }
	  }
	   if (jude == 1)
	   {
	   System.out.print("yes");
	   }
	   else
	   {
	   System.out.print("no");
	   }
	}

}

