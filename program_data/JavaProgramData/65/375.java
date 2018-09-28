package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int A;
	   int B;
	   int Aw = 0;
	   int Bw = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n-- != 0)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 A = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 B = Integer.parseInt(tempVar3);
		 }
		 if (A == 0)
		 {
		   if (B == 1)
		   {
		   Aw++;
		   }
		   else if (B == 2)
		   {
		   Bw++;
		   }
		 }
		 else if (A == 1)
		 {
		   if (B == 2)
		   {
		   Aw++;
		   }
		   else if (B == 0)
		   {
		   Bw++;
		   }
		 }
		 else
		 {
		   if (B == 0)
		   {
		   Aw++;
		   }
		   else if (B == 1)
		   {
		   Bw++;
		   }
		 }
	   }
	  if (Aw > Bw)
	  {
		System.out.print("A");
	  }
	  else if (Aw < Bw)
	  {
		System.out.print("B");
	  }
	  else
	  {
		System.out.print("Tie");
	  }
	}

}

