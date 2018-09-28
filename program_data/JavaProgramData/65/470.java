package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[200];
	  int[] b = new int[200];
	  int s1 = 0;
	  int s2 = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
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
	  if ((a[i] == 0) && (b[i] == 2))
	  {
		  s2++;
	  }
	  else if ((a[i] == 2) && (b[i] == 0))
	  {
		  s1++;
	  }
	  else
	  {
		  if (a[i] < b[i])
		  {
			  s1++;
		  }
		  else if (a[i] > b[i])
		  {
			  s2++;
		  }
		  else
		  {
			  s1++;
			  s2++;
		  }
	  }
	  }
	  if (s1 > s2)
	  {
		  System.out.print("A");
	  }
	  else if (s1 < s2)
	  {
		  System.out.print("B");
	  }
	  else
	  {
		  System.out.print("Tie");
	  }


	return 0;
	}
}

