package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[201];
	   int[] b = new int[201];
	   int c = 0;
	   int d = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
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
	   }
	   for (i = 1;i <= n;i++)
	   {
						if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
						{
						c++;
						}
						else
						{
							if (a[i] != b[i])
							{
							d++;
							}
						}
	   }
	   if (c > d)
	   {
	   System.out.print("A");
	   }
	   else
	   {
		   if (c == d)
		   {
		   System.out.print("Tie");
		   }
		   else
		   {
		   System.out.print("B");
		   }
	   }
	}

}

