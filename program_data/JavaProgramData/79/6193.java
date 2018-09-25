package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int k = 0;
		int i;
		for (i = 2;i <= x;i++)
		{
			k = (k + y) % i;
		}
		return k + 1;
	}
	public static int Main()
	{
		  int[] n = new int[20];
		  int[] m = new int[20];
		  int i;
		  int king;
		  for (i = 0;i <= 19;i++)
		  {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n[i] = Integer.parseInt(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(" ");
			   if (tempVar2 != null)
			   {
				   m[i] = Integer.parseInt(tempVar2);
			   }
			   king = f(n[i], m[i]);
			   if (n[i] != 0)
			   {
				  System.out.printf("%d\n",king);
			   }
			   else
			   {
				  break;
			   }
		  }
	}




}

