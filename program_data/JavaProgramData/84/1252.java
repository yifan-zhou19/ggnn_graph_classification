package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;


				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a = Integer.parseInt(tempVar);
				  }
				  if (a == 2)
				  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  e = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  f = Integer.parseInt(tempVar3);
				  }
			   if (e > f)
			   {
			   c = e;
			   d = f;
			   }
			   else
			   {
				c = f;
			   d = e;
			   }
				  }
			   else
			   {
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					e = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					f = Integer.parseInt(tempVar5);
				}
			   if (e > f)
			   {
			   c = e;
			   d = f;
			   }
			   else
			   {
				c = f;
			   d = e;
			   }
			   b = 1;
			   while (b < (a - 2))
			   {
			   b = b + 1;
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   g = Integer.parseInt(tempVar6);
			   }
			   if (c <= g)
			   {
						d = c;
						c = g;

			   }
						else
						{
						if (d <= g)
						{
						d = g;
						}
						}
			   }

				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					g = Integer.parseInt(tempVar7);
				}
				if (c <= g)
				{
						d = c;
						c = g;

				}
						else
						{
						if (d <= g)
						{
						d = g;
						}
						}
			   }
		   System.out.printf("%d\n%d\n",c,d);

		return 0;
	}

}

