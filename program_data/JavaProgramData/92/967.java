package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int[] a = new int[1005];
		int a1;
		int a2;
		int[] b = new int[1005];
		int b1;
		int b2;
		int i;
		int n;
		int r;
		int BL;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			a1 = 0;
			a2 = n - 1;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			BL = 0;
			while (BL == 0)
			{
				BL = 1;
				for (i = 0;i < n - 1;i++)
				{
					if (a[i] < a[i + 1])
					{
						int tmp;
						tmp = a[i];
						a[i] = a[i + 1];
						a[i + 1] = tmp;
						BL = 0;
					}
				}
			}
			BL = 0;
			while (BL == 0)
			{
				BL = 1;
				for (i = 0;i < n - 1;i++)
				{
					if (b[i] < b[i + 1])
					{
						int tmp;
						tmp = b[i];
						b[i] = b[i + 1];
						b[i + 1] = tmp;
						BL = 0;
					}
				}
			}
			b1 = 0;
			b2 = n - 1;
			r = 0;
			while (n > 0)
			{
				if (a[a1] > b[b1])
				{
					r++;
					a1++;
					b1++;
					n--;
				}
				else
				{
					if (a[a1] < b[b1])
					{
						r--;
						a2--;
						b1++;
						n--;
					}
					else
					{
						if (a[a2] > b[b2])
						{
							r++;
							a2--;
							b2--;
							n--;
						}
						else
						{
							if (a[a2] < b[b2])
							{
								r--;
								a2--;
								b1++;
								n--;
							}
							else
							{
								if (a[a2] == b[b1])
								{
									a2--;
									b1++;
									n--;
								}
								else
								{
									r--;
									a2--;
									b1++;
									n--;
								}
							}
						}
					}
				}
			}
			System.out.printf("%d\n",r * 200);
		}
	}


}

