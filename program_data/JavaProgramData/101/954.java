package <missing>;

public class GlobalMembers
{
	public static int pa(int i,int j,int k)
	{
		int d = 0;
		if (i == 0)
		{
			if (j >= i != 0 && k != i)
			{
			d = 1;
			}
			return d;
		}
		if (i == 1)
		{
			if ((j >= i != 0 && k == i) || (j < i && k != i))
			{
			d = 1;
			}
			return d;
		}
		if (i == 2)
		{
			if (j < i && k == i)
			{
			d = 1;
			}
			return d;
		}
	}
	public static int pb(int i,int j,int k)
	{
		int d = 0;
		if (j == 0)
		{
			if (j <= i != 0 && k <= i)
			{
			d = 1;
			}
			return d;
		}
			if (j == 1)
			{
			if ((j > i && k <= i) || (j <= i != 0 && k> i))
			{
			d = 1;
			}
			return d;
			}
			if (j == 2)
			{
			if (j > i && k > i)
			{
			d = 1;
			}
			return d;
			}
	}
	public static int pc(int i,int j,int k)
	{
		int d = 0;
		if (k == 0)
		{
			if (k >= j != 0 && j >= i)
			{
			d = 1;
			}
			return d;
		}
		if (k == 1)
		{
			if ((k < j && j >= i) || (k >= j != 0 && j < i))
			{
			d = 1;
			}
			return d;
		}
		if (k == 2)
		{
			if (k < j && j < i)
			{
			d = 1;
			}
			return d;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int e;
		for (i = 0;i < 3;i++)
		{
		for (j = 0;j < 3;j++)
		{
			if (j == i)
			{
				continue;
			}
			else
			{
				for (k = 0;k < 3;k++)
				{
					if (k == i || k == j)
					{
						continue;
					}
					else
					{
						e = pa(i, j, k);
						if (e == 0)
						{
							continue;
						}
						else
						{
						e = pb(i, j, k);
						if (e == 0)
						{
							continue;
						}
						else
						{
						e = pc(i, j, k);
						if (e == 0)
						{
							continue;
						}
						else
						{
							break;
						}
						}
						}
					}
				}
				if (e == 1)
				{
					break;
				}
			}
		}
		if (e == 1)
		{
			break;
		}
		}
		if (i == 2)
		{
			System.out.print("A");
		}
		if (j == 2)
		{
			System.out.print("B");
		}
		if (k == 2)
		{
			System.out.print("C");
		}
		if (i == 1)
		{
			System.out.print("A");
		}
		if (j == 1)
		{
			System.out.print("B");
		}
		if (k == 1)
		{
			System.out.print("C");
		}
		if (i == 0)
		{
			System.out.print("A");
		}
		if (j == 0)
		{
			System.out.print("B");
		}
		if (k == 0)
		{
			System.out.print("C");
		}
	}

}
