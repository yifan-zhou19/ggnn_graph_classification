package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int m1 = 0;
		  int m2 = 0;
		  for (i = 0;i < n;i++)
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
				if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
				{
					m1 += 1;
					m2 += 1;
				}
				if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
				{
					m1 += 2;
				}
				if ((a == 1 && b == 0) || (a == 0 && b == 2) || (a == 2 && b == 1))
				{
					m2 += 2;
				}
		  }
		  if (m1 == m2)
		  {
			  System.out.print("Tie");
		  }
		  else if (m1 > m2)
		  {
			  System.out.print("A");
		  }
		  else
		  {
			  System.out.print("B");
		  }
	}
}

