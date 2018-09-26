package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
	   int s = 0;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
							if (a[i] == b[i])
							{
								s = s;
							}
							if (a[i] == 0 && b[i] == 1)
							{
								s++;
							}
							if (a[i] == 0 && b[i] == 2)
							{
								s--;
							}
							if (a[i] == 1 && b[i] == 2)
							{
								s++;
							}
							if (a[i] == 1 && b[i] == 0)
							{
								s--;
							}
							if (a[i] == 2 && b[i] == 0)
							{
								s++;
							}
							if (a[i] == 2 && b[i] == 1)
							{
								s--;
							}
	   }

		  if (s > 0)
		  {
			  System.out.print("A");
		  }
		  if (s == 0)
		  {
			  System.out.print("Tie");
		  }
		  if (s < 0)
		  {
			  System.out.print("B");
		  }
	}

}

