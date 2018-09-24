package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (a[i]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  (b[i]) = Integer.parseInt(tempVar3);
		  }
		}
		int c;
		int d;
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 1)
			{
			   c++;
			}
			else if (a[i] == 0 && b[i] == 0)
			{
			   c++;
			   d++;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
			   d++;
			}
			else if (a[i] == 1 && b[i] == 0)
			{
			   d++;
			}
			else if (a[i] == 1 && b[i] == 1)
			{
			   c++;
			   d++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
			   c++;
			}
			else if (a[i] == 2 && b[i] == 1)
			{
			   d++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
			   c++;
			}
			else if (a[i] == 2 && b[i] == 2)
			{
			   c++;
			   d++;
			}
		}
		if (c > d)
		{
		   System.out.print("A");
		}
		else if (c < d)
		{
		   System.out.print("B");
		}
		else if (c == d)
		{
		   System.out.print("Tie");
		}
	   return 0;
	}
}

