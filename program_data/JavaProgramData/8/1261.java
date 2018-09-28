package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a1 = new int[200];
	public static int[] a2 = new int[200];
	public static int i;
	public static int j;
	public static int t;
	public static void toscan()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n1 = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n2 = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n1;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a1[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 0;i < n2;i++)
	  {
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a2[i] = Integer.parseInt(tempVar4);
		}
	  }
	}

	public static void paixu()
	{
	  for (i = 1;i < n1;i++)
	  {
		for (j = 0;j < i;j++)
		{
		  if (a1[j] > a1[i])
		  {
				t = a1[i];
			  a1[i] = a1[j];
			  a1[j] = t;
		  }
		}
	  }
	  for (i = 1;i < n2;i++)
	  {
		for (j = 0;j < i;j++)
		{
		  if (a2[j] > a2[i])
		  {
				t = a2[i];
			  a2[i] = a2[j];
			  a2[j] = t;
		  }
		}
	  }
	}

	public static void hebing()
	{
		for (i = 0;i < n2;i++)
		{
			a1[i + n1] = a2[i];
		}
	}

	public static void toprint()
	{
		System.out.printf("%d",a1[0]);
		for (i = 1;i < n1 + n2;i++)
		{
			System.out.printf(" %d",a1[i]);
		}
	}

	public static int Main()
	{
	  toscan();
	  paixu();
	  hebing();
	  toprint();
	  //return 0;
	}
}

