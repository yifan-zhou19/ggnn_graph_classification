package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] n = new int[300];
	  int[] m = new int[300];
	  int a = 0;
	  int i;
	  int[] j = new int[300];
	  int k = 0;
		  for (i = 0;i < 300;i++)
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
		  if (n[i] == 0)
		  {
			   a = i;
			   break;
		  }
		  }
	  for (i = 0;i < a;i++)
	  {
		  j[i] = 0;
		  for (k = 1; k < n[i]; k++)
		  {
			  j[i] = (j[i] + m[i]) % (k + 1);
		  }
			  System.out.printf("%d\n",j[i] + 1);
	  }
	  return 0;
	}

}

