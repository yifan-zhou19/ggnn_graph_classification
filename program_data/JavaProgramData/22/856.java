package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
	  int i;
	  int j;
	  int k;
	  int max;
	  int next_max;
	  char c;
	  i = 0;
	  max = 0;
	  next_max = 0;
	  do
	  {
		  i += 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   num[i] = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   if (num[i] > max)
	   {
		 max = num[i];
	   }
	  }while (c == ',');
	  if (i == 1)
	  {
		 System.out.printf("%s\n","No");
	  }
	  else
	  {
		 for (j = 1;j <= i;j++)
		 {
			 if (num[j] == max)
			 {
		   num[j] = 0;
			 }
		   else
		   {
		   }
		   if (num[j] > next_max)
		   {
			   next_max = num[j];
		   }
		   else
		   {
		   }
		 }
		 if (0 == next_max)
		 {
			 System.out.printf("%s\n","No");
		 }
		 else
		 {
			 System.out.printf("%d\n",next_max);
		 }

	  }

	}
}

