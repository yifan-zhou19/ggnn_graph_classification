package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int j;
		int A;
		int B;
		int[] e = new int[20001];
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
			   for (i = 0;i < 20001;i++)
			   {
			   e[i] = 0;
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
		for (j = 2 * a[i];j <= 2 * b[i];j++)
		{
			  e[j] = 1;
		}
	}
	for (A = 0;e[A] == 0;A++)
	{
	}
	for (B = 20000;e[B] == 0;B--)
	{
	}
	for (i = A;i <= B;i++)
	{
			if (e[i] == 0)
			{
				System.out.print("no");
				break;
			}
			if (i == B)
			{
		   System.out.printf("%d %d",A / 2,B / 2);
			}
	}
	return 0;
	}

}

