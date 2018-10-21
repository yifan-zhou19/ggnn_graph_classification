public class node
{
	public int s;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static void cpy_clr(node[] a, node[] b)
	{
		int i;
		for (i = 0;i <= MAX && (a[i].s != 0 || b[i].s != 0);i++)
		{
			if (b[i].s != 0)
			{
				a[i].s = b[i].s;
				a[i].n = b[i].n;
				b[i].s = 0;
				b[i].n = 0;
			}
			else
			{
				a[i].s = 0;
				a[i].n = 0;
				b[i].n = 0;
			}
		}
	}
	public static int chklst(node[] a, int n)
	{
		int i;
		int result = 0;
		for (i = 0;a[i].s != 0;i++)
		{
			if (a[i].s != n)
			{
				result = 0;
				break;
			}
			else
			{
				result++;
			}
		}
		return result;
	}
	public static void init(node[] a)
	{
		int i;
		for (i = 0;i < MAX;i++)
		{
			a[i].s = 0;
			a[i].n = 0;
		}
	}
	public static void Main()
	{
		node[] a = tangible.Arrays.initializeWithDefaultnodeInstances(MAX);
		node[] b = tangible.Arrays.initializeWithDefaultnodeInstances(MAX);
		int i;
		int j;
		int k;
		int l;
		int _n;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			_n = Integer.parseInt(tempVar2);
		}
		for (l = 2;l < _n;l++)
		{
			if (_n % l == 0)
			{
				init(a);
				init(b);
				a[0].s = l;
				a[0].n = l;
				while (chklst(a, _n) == 0 && a[0].s != 0)
				{
					i = 0;
					k = -1;
					if (a[0].s == 0)
					{
						break;
					}
					while (a[i].s != 0)
					{
						if (a[i].s == _n)
						{
							sum++;
						}
						else
						{
							for (j = a[i].n;j <= (_n / a[i].s);j++)
							{
								if (_n % (a[i].s * j) == 0)
								{
									b[++k].s = a[i].s * j;
									b[k].n = j;
								}
							}
						}
						i++;
					}
					cpy_clr(a, b);
				}
				i = 0;
				while (a[i].s != 0)
				{
					if (a[i].s == _n)
					{
						sum++;
					}
						i++;
				}
			}
		}
		System.out.printf("%d\n",++sum);
		sum = 0;
		}
	}

}

