package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int zuo;
		int you;
		int y;
		int x = 0;
		int c = 1;
		int d = 0;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		zuo = a[1];
		you = b[1];
		for (int j = 0;j < n;j++)
		{
			if (a[j] < zuo)
			{
				zuo = a[j];
			}
		 if (b[j] > you)
		 {
			 you = b[j];
		 }
		}
		z = zuo;
		y = you;
		for (z;z <= y;z += 0.5)
		{
			for (int k = 0;k < n;k++)
			{
				if ((z <= 1.0 * b[k]) && (z >= 1.0 * a[k]))
				{
					x = 1;
				}
			}
			 c *= x;
			 d++;
			 x = 0;
		}
		if (c == 0)
		{
			System.out.print("no");
		}
			else
			{
				System.out.printf("%d %d",zuo,you);
			}


		return 0;
	}
}

