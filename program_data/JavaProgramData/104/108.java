package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[600];
		int[] b = new int[600];
		int na;
		int nb;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		if (a[0] != 1 && b[0] != 1)
		{
			for (i = 0;;i++)
			{
			 a[i + 1] = a[i] / 2;
			 if (a[i + 1] == 1)
			 {
				na = i + 1;
				break;
			 }
			}
			for (i = 0;;i++)
			{
			 b[i + 1] = b[i] / 2;
			if (b[i + 1] == 1)
			{
				nb = i + 1;
				break;
			}
			}
			for (i = 0;;i++)
			{
			 if (a[na] == b[nb])
			 {
				na = na - 1;
				nb = nb - 1;
			 }
			 else
			 {
				System.out.printf("%d",a[na + 1]);
				break;
			 }
			}
		}
		else
		{
			System.out.print("1");
		}
	}


}

