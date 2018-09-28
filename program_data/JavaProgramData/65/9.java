package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c;
		int d;
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
				  c = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  d = Integer.parseInt(tempVar3);
			  }
			  if (c - d == 1)
			  {
				  b++;
			  }
			  else if (d - c == 1)
			  {
				  a++;
			  }
			  else if (d < c)
			  {
				  a++;
			  }
			  else if (d > c)
			  {
				  b++;
			  }
		}
		if (a < b)
		{
			System.out.print("B");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

