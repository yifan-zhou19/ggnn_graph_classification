package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int A;
		int B;
		int C;
		int[] a = new int[50];
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		A = 0;
		B = 0;
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		if (a[i] == 0 && b[i] == 1)
		{
			A++;
		}
		else if (a[i] == 1 && b[i] == 2)
		{
			A++;
		}
		else if (a[i] == 2 && b[i] == 0)
		{
			A++;
		}
		else if (a[i] == b[i])
		{
		   C++;
		}
		else
		{
			B++;
		}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		if (A == B)
		{
			System.out.print("Tie");
		}
		if (A < B)
		{
			System.out.print("B");
		}
		return 0;
	}

}

