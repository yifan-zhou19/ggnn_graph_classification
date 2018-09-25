package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char c;
	  int m;
	  int n = 1;
	  int i;
	  int[] a = new int[1001];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = m;i < 1000;i++)
	  {
		  a[i]++;
	  }
	  String tempVar2 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  while (c != '\n')
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  m = Integer.parseInt(tempVar3);
		  }
		  for (i = m;i < 1000;i++)
		  {
		  a[i]++;
		  }
		  String tempVar4 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar4 != null)
		  {
			  c = tempVar4.charAt(0);
		  }
		  n++;
	  }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   m = Integer.parseInt(tempVar5);
	   }
	  for (i = m;i < 1000;i++)
	  {
		  a[i]--;
	  }
	   String tempVar6 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar6 != null)
	   {
		   c = tempVar6.charAt(0);
	   }
	   while (c != '\n')
	   {
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  m = Integer.parseInt(tempVar7);
		  }
		  for (i = m;i < 1000;i++)
		  {
			  a[i]--;

		  }
		  String tempVar8 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar8 != null)
		  {
			  c = tempVar8.charAt(0);
		  }
	   }
	   m = 0;
	   for (i = 1;i < 1000;i++)
	   {
		   if (a[i] > m)
		   {
			   m = a[i];
		   }
	   }
		   System.out.printf("%d %d",n,m);
	}


}

