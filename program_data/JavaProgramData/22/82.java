package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		int i = 0;
		int max;
		int k;
		int mid;
		int flag = 1;
	 char c;
	 do
	 {
		 i++;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n[i] = Integer.parseInt(tempVar);
	  }
	  c = System.in.read();
	 } while (c == ',');
	  k = i;
	  if (k == 1)
	  {
		  flag = 0;
	  }
	  else
	  {
		  max = n[1];
	  for (i = 1;i <= k;i++)
	  {
	   if (max < n[i])
	   {
		 max = n[i];
	   }
	  }
	  mid = 0;
	  for (i = 1;i <= k;i++)
	  {
		if (mid < n[i] && n[i] < max)
		{
			mid = n[i];
		}
	  }
	  }
	  if (mid == 0 || flag == 0)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  System.out.printf("%d",mid);
	  }
	}

}

