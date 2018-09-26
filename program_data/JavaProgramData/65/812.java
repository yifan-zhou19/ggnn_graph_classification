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
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		if (a[i] == b[i] + 1)
		{
			sb++;
		}
		else if (b[i] == a[i] + 1)
		{
			sa++;
		}
		else if (a[i] == 0 && b[i] == 2)
		{
			sb++;
		}
		else if (a[i] == 2 && b[i] == 0)
		{
			sa++;
		}
	  }
		if (sa == sb)
		{
			System.out.print("Tie");
		}
		else if (sa > sb)
		{
			System.out.print("A");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}
}

