package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a = 0;
	  int n;
	  int i;
	  int k;
	  int b = 0;
	  int e;
	  int[] nn = new int[MAX];
	  int[] mm = new int[MAX];
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
		  nn[i] = Integer.parseInt(tempVar2);
	  }
	  }
		for (i = 0;i < n;i++)
		{
	  for (k = 0;k < i;k++)
	  {

	   if (nn[k] == nn[i])
	   {
	   a++;
	   }
	  }
	   if (a == 0)
	   {
		mm[b] = nn[i];
		b++;
	   }
	a = 0;
		}
	  for (int j = 0;j < b - 1;j++)
	  {
	  System.out.printf("%d,",mm[j]);
	  }
	  System.out.printf("%d",mm[b - 1]);
	 return 0;
	}



}

