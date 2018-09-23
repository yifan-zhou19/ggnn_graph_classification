package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i;
		int y;
		int j;
		int k;
		int l;
		int[] xn = new int[15];
		int[] yn = new int[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;x != 0;i++)
		{
			xn[i] = x;
			x = x / 2;
		}
		k = i - 1;
		for (i = 0;y != 0;i++)
		{
			yn[i] = y;
			y = y / 2;
		}
		l = i - 1;
		if (xn[0] == yn[0])
		{
			System.out.printf("%d",xn[0]);
		}
		else
		{
		for (;;k--)
		{
			if (xn[k] != yn[l])
			{
				j = k + 1;
				break;
			}
			l--;
		}
		System.out.printf("%d",xn[j]);
		}



	}
}

