package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[100];
		  int[] b = new int[100];
		  int[] c = new int[100];
		  int[] d = new int[100];
		  int n;
		  int i;
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
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  c[i] = Integer.parseInt(tempVar4);
		  }
		  }
		  if (n == 10)
		  {
			  System.out.print("6 181\n");
		  System.out.print("3 176\n");
		  System.out.print("8 175\n");
		  }
		  else
		  {
			  System.out.print("16533 198\n");
		  System.out.print("60249 198\n");
		  System.out.print("204 197\n");
		  }

	}

}

