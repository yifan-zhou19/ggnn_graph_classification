package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i = 0;
		int j = 0;
		int flag = 0;
	  int[] str = new int[1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   str[i] = Integer.parseInt(tempVar3);
	   }
	  }
	  i = 0;
	  for (i = 0;i < n / 2 + 1;i++)
	  {
		  j = 0;
		  for (j = 0;j < n;j++)
		  {
			  if ((k - str[j]) == str[i])
			  {
				  flag = 1;
			   break;
			  }
		  }

		  if (flag == 1)
		  {
			  System.out.print("yes");
			  break;
		  }
	  }
		 if (flag == 0)
		 {
		  System.out.print("no");
		 }

		return 0;
	}
}

