package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[400];
		int i;
		int p;
		int q = 0;
		int t;
		int c;
		char h;
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i < 400)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				h = tempVar2.charAt(0);
			}
			if (h == ',')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			i++;
			}
			else
			{
				c = i;
				break;
			}
		}
		if (c == 1)
		{
			System.out.print("No");
		}
		else
		{
			if (a[1] > a[0])
			{
				p = a[1];
				q = a[0];
			}
			else if (a[1] < a[0])
			{
				p = a[0];
				q = a[1];
			}
			else if (a[1] == a[0])
			{
				p = a[1];
				q = 0;
			}
			i = 2;
			for (i = 2;i < c;i++)
			{
				if (a[i] > p)
				{
					q = p;
					p = a[i];
				}
				else if (a[i] < p && a[i] >= q)
				{
					q = a[i];
				}
			}
			if (q != 0)
			{
				 System.out.printf("%d",q);
			}
			else
			{
				System.out.print("No");
			}
		}
		return 0;
	}

}

