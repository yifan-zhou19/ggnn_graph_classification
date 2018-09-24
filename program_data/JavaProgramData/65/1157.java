package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[200];
	  int[] b = new int[200];
	  int i;
	  int A = 0;
	  int B = 0;
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
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
		{
		A++;
		}
		else
		{
			   if (a[i] - b[i] == 0)
			   {
				   ;
			   }
			   else
			   {
			   B++;
			   }
		}
	  }
	  if (A < B)
	  {
	  System.out.print("B");
	  }
	  else
	  {
			if (A > B)
			{
			System.out.print("A");
			}
			else
			{
			System.out.print("Tie");
			}
	  }
	  return 0;
	}


}

