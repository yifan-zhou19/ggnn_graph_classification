package <missing>;

public class GlobalMembers
{
	public static int apple(int x,int y)
	{
	  int k;
	  if (y == 1)
	  {
		  k = 1;
	  }
	  else
	  {
		   if (x > y)
		   {
			   k = apple(x - y, y) + apple(x, y - 1);
		   }
		if (x < y)
		{
			k = apple(x, y - 1);
		}
		if (x == y)
		{
			k = 1 + apple(x, y - 1);
		}
	  }
	 return (k);
	}
	public static void Main()
	{
	  int i;
	  int a;
	  int[] m = new int[50];
	  int[] n = new int[50];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < a;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  n[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < a;i++)
	  {
		  System.out.printf("%d\n",apple(m[i], n[i]));
	  }
	return (0);
	}

}

