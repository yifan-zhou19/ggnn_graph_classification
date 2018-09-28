package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int n;
	  int zu;
	  int[] fei = new int[50];
	  int[] a = new int[50];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  zu = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= zu;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 a[i] = n;
	  }
	  fei[1] = 1;
	  fei[2] = 1;
	  for (i = 3;i <= 20;i++)
	  {
		 fei[i] = fei[i - 1] + fei[i - 2];
	  }
	  for (i = 1;i <= zu;i++)
	  {
		 System.out.printf("%d\n",fei[a[i]]);
	  }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   fei[a[i]] = Integer.parseInt(tempVar3);
	   }
	   return 0;
	}
}

