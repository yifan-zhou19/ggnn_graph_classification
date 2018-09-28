package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int m;
		int p;
		int r;

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
			   m = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p = Integer.parseInt(tempVar3);
		   }
			r = m - p;
			if (r == 1 || r == -2)
			{
				b++;
			}
			else if (r == 0)
			{
				c++;
			}
			else if (r == -1 || r == 2)
			{
				a++;
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

