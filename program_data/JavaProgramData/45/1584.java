package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j = 0;
		int x;
		int y;
		int[] c = new int[100];
		int k = 0;
		int m = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x = a.length();
		y = b.length();
		for (i = 0;i < y - x + 1;i++)
		{
			for (j = 0;j < x;j++)
			{
				if (a.charAt(j) == b.charAt(i + j))
				{
					m++;
				}
			}
			if (m == x)
			{
				c[k] = i;
				k++;
			}
			m = 0;
		}
		System.out.printf("%d\n",c[0]);

	}
}

