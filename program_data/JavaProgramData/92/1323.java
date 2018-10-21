package <missing>;

public class GlobalMembers
{
	public static int[] TianJi = new int[1000];
	public static int[] QiWang = new int[1000];
	public static int cmp(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1=(int *)elem1;
		int p1 = (int)elem1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2=(int *)elem2;
		int p2 = (int)elem2;
		if (p1 < p2)
		{
			return -1;
		}
		else if (p1 == p2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int equalnum;
		int equalhorse;
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
					TianJi[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					QiWang[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(TianJi,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(QiWang,n,(Integer.SIZE / Byte.SIZE),cmp);
			j = 0;
			sum = 0;
			equalnum = 0;
			equalhorse = 0;
			for (i = 0;i < n;i++)
			{
				if (TianJi[i] > QiWang[j])
				{
					sum += 200;
					j++;
				}
				else if (TianJi[i] == QiWang[j])
				{
					if (equalnum > 0)
					{
						if (TianJi[i] > equalhorse)
						{
							equalnum--;
							sum += 200;
							continue;
						}
					}
					equalhorse = TianJi[i];
					equalnum++;
					j++;
				}
				else
				{
					if (equalnum > 0)
					{
						if (TianJi[i] > equalhorse)
						{
							equalnum--;
							sum += 200;
						}
					}
				}
			}
			sum = sum - (n - j) * 200;
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

