package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int a = 0;
		 int b = 0;
		 int[] ax = new int[250];
		 int[] bx = new int[250];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < n;i++)
		 {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					ax[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					bx[i] = Integer.parseInt(tempVar3);
				}
		 }
		for (int i = 0;i < n;i++)
		{
			if ((ax[i] == 1) && (bx[i] == 0))
			{
				b = b + 1;
			}
			 if ((ax[i] == 0) && (bx[i] == 1))
			 {
				 a = a + 1;
			 }
			  if ((ax[i] == 2) && (bx[i] == 0))
			  {
				  a = a + 1;
			  }
			  if ((ax[i] == 1) && (bx[i] == 2))
			  {
				  a = a + 1;
			  }
			  if ((ax[i] == 2) && (bx[i] == 1))
			  {
				  b = b + 1;
			  }
			   if ((ax[i] == 0) && (bx[i] == 2))
			   {
				   b = b + 1;
			   }
				if (ax[i] == bx[i])
				{
					a = a;
					b = b;
				}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		  if (a < b)
		  {
			  System.out.print("B");
		  }
			if (a == b)
			{
				System.out.print("Tie");
			}
		 return 0;
	}

}

