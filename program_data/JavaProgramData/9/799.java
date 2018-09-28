package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int l;
	  int m;
	  int n;
	  char[][] id = new char[200][200];
	  int[] age = new int[100];
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
		   id[i] = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   age[i] = Integer.parseInt(tempVar3);
	   }
	  }
	   for (j = 200;j >= 60;j--)
	   {
		  for (i = 0;i < n;i++)
		  {
			  if (age[i] == j)
			  {
			System.out.printf("%s\n",id[i]);
			  }
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		if (age[i] < 60)
		{
		 System.out.printf("%s\n",id[i]);
		}
	   }
	   System.in.read();
	   System.in.read();
	}


}

