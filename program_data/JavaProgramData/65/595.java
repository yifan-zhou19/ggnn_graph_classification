package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int[] sy = new int[100];
		int P = 0;
		int A = 0;
		int B = 0;
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
			if (a[i] == b[i])
			{
				sy[i] = 0;
				P++;
			}
			else if (a[i] - b[i] == -1 || a[i] - b[i] == 2)
			{
				sy[i] = 1;
				A++;
			}
			else
			{
				sy[i] = -1;
				B++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (A > B)
			{
				System.out.print("A\n");
				break;
			}
			else if (A < B)
			{
				System.out.print("B\n");
				break;
			}
			else
			{
				System.out.print("Tie\n");
				break;
			}
		}
		return 0;
	}

}

