package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int tempa = 0;
		int tempb = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 1)
			{
				tempa++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				tempa++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				tempa++;
			}
			else if (a[i] == b[i])
			{
				tempa++;
				tempb++;
			}
			else
			{
				tempb++;
			}
		}
		if (tempa > tempb)
		{
			System.out.print("A");
		}
		if (tempa < tempb)
		{
			System.out.print("B");
		}
		if (tempa == tempb)
		{
			System.out.print("Tie");
		}



		return 0;
	}
}

