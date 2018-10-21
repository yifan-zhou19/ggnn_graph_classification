package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] cqa = new int[200];
	  int[] cqb = new int[200];
	  int a;
	  int b;
	  a = 0;
	  b = 0;
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
			cqa[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cqb[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if (cqa[i] == cqb[i])
		{
		  a = a;
		  b = b;
		}
		if (cqa[i] - 1 == cqb[i])
		{
		  a = a;
		  b = b + 1;
		}
		if (cqa[i] + 1 == cqb[i])
		{
		  a = a + 1;
		  b = b;
		}
		if (cqa[i] + 2 == cqb[i])
		{
		  a = a;
		  b = b + 1;
		}
		if (cqa[i] - 2 == cqb[i])
		{
		  a = a + 1;
		  b = b;
		}
	  }
		if (a == b)
		{
		  System.out.print("Tie");
		}
		if (a < b)
		{
		  System.out.print("B");
		}
		if (a > b)
		{
		  System.out.print("A");
		}
	return 0;
	}
}

