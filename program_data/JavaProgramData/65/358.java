package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int i;
	int a1 = 0;
	int b1 = 0;
	int c1 = 0;
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
						a = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						b = Integer.parseInt(tempVar3);
					}
					if ((a < b && (b - a) == 1) || (a> b && (a - b) == 2))
					{
					a1++;
					}
					else if (a == b)
					{
						c1++;
					}
					else
					{
						b1++;
					}
	}
					if (a1 > b1)
					{
					System.out.print("A");
					}
					else if (a1 < b1)
					{
					System.out.print("B");
					}
					  else
					  {
					  System.out.print("Tie");
					  }
	}



}

