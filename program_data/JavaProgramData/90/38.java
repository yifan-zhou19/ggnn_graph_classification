package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int put = new int(int x,int y);
		int[] m = new int[100];
		int[] n = new int[100];
		int t;
		int[] k = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= t;i++)
		{
			k[i] = put(m[i], n[i]);
			System.out.printf("%d\n",k[i]);
		}
	}
	public static int put(int x,int y)
	{

		if (y == 1)
		{
			return (1);
		}
		else if (x > y)
		{
			return (put(x - y, y) + put(x, y - 1));
		}
		else if (x <= y != 0 && x != 1)
		{
			return (put(x, x - 1) + 1);
		}
		else
		{
			return (1);
		}




	}















}

