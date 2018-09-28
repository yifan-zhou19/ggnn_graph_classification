package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int A;
		int B;
		int Aw = 0;
		int Bw = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B = Integer.parseInt(tempVar3);
			}
			if (A == 0 && B == 1)
			{
				Aw += 1;
			}
			else if (A == 0 && B == 2)
			{
				Bw += 1;
			}
			else if (A == 1 && B == 0)
			{
				Bw += 1;
			}
			else if (A == 1 && B == 2)
			{
				Aw += 1;
			}
			else if (A == 2 && B == 0)
			{
				Aw += 1;
			}
			else if (A == 2 && B == 1)
			{
				Bw += 1;
			}
		}
		if (Aw > Bw)
		{
			System.out.print("A\n");
		}
		else if (Aw < Bw)
		{
			System.out.print("B\n");
		}
		else if (Aw = Bw)
		{
			System.out.print("Tie\n");
		}
		return 0;
	}
}

