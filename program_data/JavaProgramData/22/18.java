package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[65536];
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  a[n]++; //scanf(",%d",&n);printf("%d",n);
	  while (scanf(",%d", n) != 0)
	  {
		  a[n]++;
	  }
	  k = 0;
	  for (i = 65535;i >= 0;i--)
	  {
		  if (a[i] != 0)
		  {
			  k++;
		  }
		  if (k == 2)
		  {
			  break;
		  }
	  }
	  if (k == 2)
	  {
		  System.out.printf("%d",i);
	  }
	  else
	  {
		  System.out.print("No");
	  }
	}
}

