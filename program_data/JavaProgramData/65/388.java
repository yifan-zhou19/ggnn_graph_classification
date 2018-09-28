package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int A;
		int B;
		int i;
		A = 0;
		B = 0;
		int[] a = new int[200];
		int[] b = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		if (a[i] == 0 && b[i] == 0)
		{
			A++;
			B++;
		}
		else if (a[i] == 0 && b[i] == 1)
		{
			A++;
		}
		else if (a[i] == 0 && b[i] == 2)
		{
			B++;
		}
		else if (a[i] == 1 && b[i] == 0)
		{
			B++;
		}
		else if (a[i] == 1 && b[i] == 1)
		{
			B++;
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
		else if (a[i] == 2 && b[i] == 1)
		{
			B++;
		}
		else if (a[i] == 2 && b[i] == 2)
		{
			B++;
			A++;
		}
		}
		if (A == B)
		{
			System.out.print("Tie");
		}
		else if (A > B)
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

