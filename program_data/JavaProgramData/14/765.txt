package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[99999];
		int[] b = new int[2];
		int i;
		int k;
		int m;
		int[] s = new int[99999];
		int first = 0;
		int x;
		int y;
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
			for (k = 0;k < 2;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[k] = Integer.parseInt(tempVar3);
				}
			}
			s[i] = b[0] + b[1];
		}

		for (m = 0;m < 3;m++)
		{
			first = 0;
			for (x = 0;x < n;x++)
			{

				   if (s[x] > first)
				   {
					   first = s[x];
				   y = x + 1;
				   }


			}
			System.out.printf("%d %d\n",y,first);
			s[y - 1] = 0;

		}
	}

}

