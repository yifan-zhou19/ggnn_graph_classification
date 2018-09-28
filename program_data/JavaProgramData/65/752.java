package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[200];
	int[] b = new int[200];
	int sa = 0;
	int sb = 0;
	int i;

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
		  (a[i]) = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  (b[i]) = Integer.parseInt(tempVar3);
	  }
	}

	for (i = 0;i < n;i++)
	{
	  if (a[i] == 0)
	  {
		if (b[i] == 1)
		{
			sa++;
		}
		if (b[i] == 2)
		{
			sb++;
		}
	  }
	  if (a[i] == 1)
	  {
		if (b[i] == 0)
		{
		  sb++;
		}
		if (b[i] == 2)
		{
		  sa++;
		}
	  }
	  if (a[i] == 2)
	  {
		if (b[i] == 0)
		{
			sa++;
		}
		if (b[i] == 1)
		{
			sb++;
		}
	  }

	}
	if (sa > sb)
	{
	System.out.print("A");
	}
	if (sa < sb)
	{
	System.out.print("B");
	}
	if (sa == sb)
	{
	System.out.print("Tie");
	}

	return 0;
	}
}

