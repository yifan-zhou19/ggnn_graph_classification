int minih(int numh,int * p) / *?????*p * /
{
	int min;
	min = p;
	int i;
	for (i = 1;i <= numh;i++)
	{
		if (min > *(p + i - 1))
		{
			min = (p + i - 1);
		}
		else
		{
		}
	}
	return min;
}
int minil(int numl,int * p) / *?????*p * /
{
	int min;
	min = p;
	int i;
	for (i = 1;i <= numl;i++)
	{
		if (min > *(p + 101 * (i - 1)))
		{
			min = (p + 101 * (i - 1));
		}
		else
		{
		}
	}
	return min;
}
int main()
{
	int[][] a = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	p = a[0][0];
	int i;
	int j;
	int k;
	int n;
	int minor;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int hang;
	int lie;
	for (i = 1;i <= n;i++)
	{
		/*??????sum???   hang   lie   ?n    */
		hang = n;
		lie = n;
		sum = 0;
		/*??????
		????*/
		for (j = 1;j <= n;j++)
		{
			for (k = 1;k <= n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p + 101 * (j - 1) + k - 1 = Integer.parseInt(tempVar2);
				}
			}
		}
		/*?????????????????*/
		for (minor = 1;lie > 1;minor++)
		{
			/*???????*/
			for (j = 1;j <= hang;j++)
			{
				int minihang;
				/*?j????*(p+101*(j-1))*/
				minihang = minih(lie,(p + 101 * (j - 1)));
				for (k = 1;k <= lie;k++)
				{
					*(p + 101 * (j - 1) + k - 1) -= minihang;
				}
			}
			/*???????*/
			for (j = 1;j <= lie;j++)
			{
				int minilie;
				/*?j????*(p+(j-1))*/
				minilie = minil(hang,(p + (j - 1)));
				for (k = 1;k <= hang;k++)
				{
					*(p + (j - 1) + 101 * (k - 1)) -= minilie;
				}
			}
			sum += *(p + 102);
			/*????????????????hang-1   */
			for (j = 2;j <= hang;j++)
			{
				for (k = 1;k <= lie;k++)
				{
					*(p + 101 * (j - 1) + k - 1) = *(p + 101 * j + k - 1);
				}
			}
			hang--;
			/*????????????????lie-1   */
			for (j = 2;j <= lie;j++)
			{
				for (k = 1;k <= hang;k++)
				{
					*(p + 101 * (k - 1) + j - 1) = *(p + 101 * (k - 1) + j);
				}
			}
			lie--;
		}
		System.out.printf("%d\n",sum);
	}
	return 0;
}

