package <missing>;

public class GlobalMembers
{
	/*????????????????????????
	a)  ???????????????????
	b)  ???????????
	c)  ??????????
	d)  ?????????
	??????????????????????????
	 */
	public static int[] shuzu1 = new int[100];
	public static int[] shuzu2 = new int[100];
	public static int n1;
	public static int n2;
	public static void scan()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shuzu1[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n2;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			shuzu2[i] = Integer.parseInt(tempVar4);
		}
		}
	}
	public static void paixu(int[] shuzu, int n)
	{
		int min;
		int i;
		int j;
		int temp;
		for (i = 0;i < n;i++)
		{
			min = i;
			for (j = i + 1;j < n;j++)
			{
				if (shuzu[j] < shuzu[min])
				{
				min = j;
				}
			}
			temp = shuzu[i];
			shuzu[i] = shuzu[min];
			shuzu[min] = temp;
		}
	}
	public static void hebing(int[] shuzu1, int[] shuzu2, int n1, int n2)
	{
		int i;
		for (i = 0;i < n1;i++)
		{
		System.out.printf("%d ",shuzu1[i]);
		}
		for (i = 0;i < n2 - 1;i++)
		{
		System.out.printf("%d ",shuzu2[i]);
		}
		System.out.printf("%d",shuzu2[i]);
	}
	public static void Main()
	{
		scan();
		paixu(shuzu1, n1);
		paixu(shuzu2, n2);
		hebing(shuzu1, shuzu2, n1, n2);
	}

}

