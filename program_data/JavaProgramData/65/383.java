package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
	 if (a == 0)
	 {
		 if (b == 0)
		 {
		 return 0;
		 }
		 else
		 {
		   if (b == 1)
		   {
		   return 1;
		   }
		   else
		   {
		   return -1;
		   }
		 }
	 }
	   if (a == 1)
	   {
		if (b == 0)
		{
		return -1;
		}
		else
		{
		if (b == 1)
		{
		return 0;
		}
		else
		{
		return 1;
		}

		}
	   }

		if (a == 2)
		{
		if (b == 0)
		{
		return 1;
		}
		else
		{
		if (b == 1)
		{
		return -1;
		}
		else
		{
		return 0;
		}
		}

		}
	}


	 public static int Main()
	 {
		int a;
		int b;
		int i = 0;
		int j = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++)
		{
		int a;
		int b;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }

		 j = j + f(a, b);
		}

		 if (j > 0)
		 {
		 System.out.print("A");
		 }
		 else
		 {
		  if (j == 0)
		  {
		  System.out.print("Tie");
		  }
		 else
		 {
		 System.out.print("B");
		 }
		 }

	 }

}

