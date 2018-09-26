package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int n;
	  int nn;
	  int k;
	  int t;
	  int j;
	  int c;
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
			  nn = Integer.parseInt(tempVar2);
		  }
		  if (nn == 0)
		  {
			  System.out.print("60\n");
		  }
		  else
		  {
			  c = 0;
			  t = 0;

			for (j = 1;j <= nn;j++)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   k = Integer.parseInt(tempVar3);
			   }
			   if (k < 60)
			   {
				   c = k;
				   t = k + j * 3;
			   }
			}
			if (t >= 63)
			{
				c = c - (t - 63);
			}
			else if (t < 60)
			{
				c = c + (60 - t);
			}
			System.out.printf("%d\n",c);
		  }
	  }
	}

}

