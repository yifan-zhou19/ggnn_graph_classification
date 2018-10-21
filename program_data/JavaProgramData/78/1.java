public class person
{
	public char name;
	public int w;
}

package <missing>;

public class GlobalMembers
{
	public static person[] stu =
	{
		new person('z', 0),
		new person('q', 0),
		new person('s', 0),
		new person('l', 0),
		new person('t', 0)
	};
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		int z;
		int q;
		int s;
		int l;
		int a;
		int b;

		while (i < 5)
		{
			i++;
			z = i;
			j = 0;
			while (j < 5)
			{
				j++;
				if (j != i)
				{
					q = j;
					k = 0;
					while (k < 5)
					{
						k++;
						if (k != i && k != j)
						{
							s = k;
							p = 0;
							while (p < 5)
							{
								p++;
								if (p != i && p != j && p != k)
								{
									l = p;
									if (z + q == s + l && z + l > s + q && z + s < q)
									{
										stu[0].w = z;
										stu[1].w = q;
										stu[2].w = s;
										stu[3].w = l;
										for (a = 0;a < 4;a++)
										{
											for (b = 0;b < 4;b++)
											{
												if (stu[b].w < stu[b + 1].w)
												{
													stu[5] = stu[b];
													stu[b] = stu[b + 1];
													stu[b + 1] = stu[5];
												}

											}
										}
										for (a = 0;a < 4;a++)
										{
											System.out.printf("%c %d\n",stu[a].name,10 * stu[a].w);
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}




}
