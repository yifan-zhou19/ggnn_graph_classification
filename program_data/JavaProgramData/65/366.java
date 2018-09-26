package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int[][] s = new int[200][2];
	 int a = 0;
	 int b = 0;
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
			s[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s[i][1] = Integer.parseInt(tempVar3);
		}
		if (s[i][0] == 0)
		{
		   if (s[i][1] == 1)
		   {
		   a++;
		   }
		   else
		   {
			  if (s[i][1] == 2)
			  {
			  b++;
			  }
			  else
			  {
				  ;
			  }
		   }
		}

		 if (s[i][0] == 1)
		 {
		   if (s[i][1] == 2)
		   {
		   a++;
		   }
		   else
		   {
			  if (s[i][1] == 0)
			  {
			  b++;
			  }
			  else
			  {
				  ;
			  }
		   }
		 }

		 if (s[i][0] == 2)
		 {
		   if (s[i][1] == 0)
		   {
		   a++;
		   }
		   else
		   {
			  if (s[i][1] == 1)
			  {
			  b++;
			  }
			  else
			  {
				  ;
			  }
		   }
		 }


	 }
	 if (a > b)
	 {
		System.out.print("A");
	 }
		else
		{
		   if (a < b)
		   {
		   System.out.print("B");
		   }
		   else
		   {
		   System.out.print("Tie");
		   }
		}
	}

}

