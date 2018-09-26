package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
	  int[] y = new int[1000];
	  int i;
	  int n;
	  int s;
	  int t;
	  int j;
	  char c;
	for (i = 0;;i++)
	{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  c = tempVar2.charAt(0);
		  }
		if (c != ',')
		{
			break;
		}
	}
	 n = i + 1;
	for (i = 0;;i++)
	{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  y[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  c = tempVar4.charAt(0);
		  }
		if (c != ',')
		{
			break;
		}
	}
	  t = 0;
	 for (i = 0;i < 1000;i++)
	 {
		 s = 0;
		 for (j = 0;j < n;j++)
		 {
			if (i >= x[j] != 0 && i < y[j])
			{
			s++;
			}
		 }
		 if (s > t)
		 {
			 t = s;
		 }
	 }
	 System.out.printf("%d %d",n,t);

	return 0;
	}
}

