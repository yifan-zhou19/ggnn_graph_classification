package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] number = new int[500];
	  int[] odd = new int[500];
	  int n;
	  int i;
	  int j;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= 499;i++)
	  {
		  odd[i] = 0;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  number + i = tempVar2;
		  }
		  if (number[i] % 2 != 0)
		  {
			 odd[i] = number[i];
		  }
	  }
	  for (i = 0;i <= 499;i++)
	  {
		  for (j = i + 1;j <= 499;j++)
		  {
			  if (odd[i] > odd[j])
			  {
				  t = odd[i];
				  odd[i] = odd[j];
				  odd[j] = t;
			  }
		  }
	  }
	  for (i = 1;i <= 498;i++)
	  {
		  if (odd[i] != 0)
		  {
		  System.out.printf("%d,",odd[i]);
		  }
	  }
	  System.out.printf("%d",odd[499]);
	}

}

