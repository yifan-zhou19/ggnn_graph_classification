public class node
{
	public int x;
	public int layer;
	public int t;
}

package <missing>;

public class GlobalMembers
{
	public static node[] a = tangible.Arrays.initializeWithDefaultnodeInstances(3); //????????????????????????

	public static void Main()
	{
		int i;
		int j;
		int tmp;
		int sign = 0;
		int sign1 = 0;
		int sign2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1].x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[2].x = Integer.parseInt(tempVar2);
		}
		if (a[1].x == a[2].x)
		{
			System.out.printf("%d\n",a[1].x);
		}
		else
		{
			if (a[1].x == 1 || a[2].x == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				if (a[1].x < a[2].x)
				{
					tmp = a[1].x;
					a[1].x = a[2].x;
					a[2].x = tmp;
				} //?????
				for (i = 1;i <= 10;i++)
				{
					if (a[1].x >= Math.pow(2,i) && a[1].x < Math.pow(2,i + 1))
					{
						a[1].layer = i + 1;
						sign1 = 1;
					}
					if (a[2].x >= Math.pow(2,i) && a[2].x < Math.pow(2,i + 1))
					{
						a[2].layer = i + 1;
						sign2 = 1;
					}
					if (sign1 != 0)
					{
						if (sign2 != 0)
						{
							break;
						}
					}
				} //????????
				a[1].t = a[1].x;
				a[2].t = a[2].x;
				for (i = a[1].layer,j = a[2].layer;i >= 1;)
				{
					if (a[1].t % 2 != 0)
					{
						a[1].t = (a[1].t - 1) / 2;
					}
					else
					{
						a[1].t = a[1].t / 2;
					}
					i--;
					if (i == a[2].layer)
					{
						if (a[1].t == a[2].t)
						{
							System.out.printf("%d\n",a[1].t);
							sign = 1;
							break;
						}
					}
					else
					{
						if (i < a[2].layer)
						{
							do
							{
								if (a[2].t % 2 != 0)
								{
									a[2].t = (a[2].t - 1) / 2;
								}
								else
								{
									a[2].t = a[2].t / 2;
								}
								j--;
							}while (j > i);
							if (a[2].t == a[1].t)
							{
								System.out.printf("%d\n",a[1].t);
								sign = 1;
								break;
							}
						}
					}
				}
			}
		}
	}

}

