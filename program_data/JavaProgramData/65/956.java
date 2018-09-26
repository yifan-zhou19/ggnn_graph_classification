package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int i;
		int n;
		int[] A = new int[200];
		int[] B = new int[200];
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
			A[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			B[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		if (A[i] == 0 && B[i] == 1)
		{
			a++;
		}
		else if (A[i] == 0 && B[i] == 2)
		{
			b++;
		}
		else if (A[i] == 0 && B[i] == 0)
		{
			a++;
			b++;
		}
		else if (A[i] == 1 && B[i] == 2)
		{
			a++;
		}
		else if (A[i] == 1 && B[i] == 0)
		{
			b++;
		}
		else if (A[i] == 1 && B[i] == 1)
		{
			a++;
			b++;
		}
		else if (A[i] == 2 && B[i] == 0)
		{
			a++;
		}
		else if (A[i] == 2 && B[i] == 1)
		{
			b++;
		}
		else if (A[i] == 2 && B[i] == 2)
		{
			a++;
			b++;
		}
		}
	  if (a > b)
	  {
		  System.out.print("A");
	  }
	  else if (a < b)
	  {
		  System.out.print("B");
	  }
	  else if (a == b)
	  {
		  System.out.print("Tie");
	  }
		return 0;
	}

}

