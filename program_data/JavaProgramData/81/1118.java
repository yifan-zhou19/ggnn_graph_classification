package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int m;
		int n;
		int i;
		int temp;
		int x;
		int y;
		for (i = 0;i < 25;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if ((m != 0 && m != 1 && m != 2 && m != 3 && m != 4) || (n != 0 && n != 1 && n != 2 && n != 3 && n != 4))
		{
			System.out.print("error");
		}
		else
		{
			x = m * 5;
			y = n * 5;
			for (i = 0;i < 5;i++)
			{
				temp = a[x];
				a[x] = a[y];
				a[y] = temp;
				x++;
				y++;
			}
			System.out.printf("%d %d %d %d %d\n",a[0],a[1],a[2],a[3],a[4]);
			System.out.printf("%d %d %d %d %d\n",a[5],a[6],a[7],a[8],a[9]);
			System.out.printf("%d %d %d %d %d\n",a[10],a[11],a[12],a[13],a[14]);
			System.out.printf("%d %d %d %d %d\n",a[15],a[16],a[17],a[18],a[19]);
			System.out.printf("%d %d %d %d %d\n",a[20],a[21],a[22],a[23],a[24]);
		}
		return 0;
	}
}

