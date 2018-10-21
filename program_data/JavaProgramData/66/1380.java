package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int nian;
	 int yue;
	 int ri;
	 int i;
	 int j = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 nian = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 yue = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 ri = Integer.parseInt(tempVar3);
	 }
	nian = nian % 2800;
	 for (i = 1;i < nian;i++)
	 {
	  if (i % 400 == 0 || i % 100 != 0 && i % 4 == 0)
	  {
	   j += 366 % 7;
	  }
	  else
	  {
	   j += 365 % 7;
	  }
	 }
	 for (i = 1;i < yue;i++)
	 {
	  if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10))
	  {
	   j += 31;
	  }
	  else
	  {
	   if ((i == 2) && (nian % 4 == 0))
	   {
		j += 29;
	   }
	   else
	   {
		if (i == 2)
		{
		 j += 28;
		}
		else
		{
		 j += 30;
		}
	   }
	  }
	 }
	 j += ri;
	 j %= 7;
	 if (j == 0)
	 {
	  System.out.print("Sun.");
	 }
	 else
	 {
	  if (j == 1)
	  {
	   System.out.print("Mon.");
	  }
	  else
	  {
	   if (j == 2)
	   {
		System.out.print("Tue.");
	   }
	   else
	   {
		if (j == 3)
		{
		 System.out.print("Wen.");
		}
		else
		{
		 if (j == 4)
		 {
		  System.out.print("Thu.");
		 }
		 else
		 {
		  if (j == 5)
		  {
		   System.out.print("Fri.");
		  }
		  else
		  {
		   System.out.print("Sat.");
		  }
		 }
		}
	   }
	  }
	 }
	 return 0;
	}


}

