package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[100];
		  int[] b = new int[100];
		  int A = 0;
		  int B = 0;
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
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
				  if (a[i] == b[i])
				  {
				  A = A + 1;
				  B = B + 1;
				  }
				  else if ((a[i] == 0) && (b[i] == 1))
				  {
				  A = A + 1;
				  }
				  else if ((a[i] == 1) && (b[i] == 2))
				  {
				  A = A + 1;
				  }
				  else if ((b[i] == 0) && (a[i] == 1))
				  {
				  B = B + 1;
				  }
				  else if ((b[i] == 1) && (a[i] == 2))
				  {
				  B = B + 1;
				  }
				  else if ((a[i] == 2) && (b[i] == 0))
				  {
				  A = A + 1;
				  }
				  else if ((b[i] == 2) && (a[i] == 0))
				  {
				  B = B + 1;
				  }
		  }
		  if (A > B)
		  {
		  System.out.print("A");
		  }
		  else if (A < B)
		  {
		  System.out.print("B");
		  }
		  else
		  {
		  System.out.print("Tie");
		  }

	}

}

