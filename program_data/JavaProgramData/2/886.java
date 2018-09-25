public class x
{
	public int num;
	public String author = new String(new char[26]);
	public int amount;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		x[] y = tangible.Arrays.initializeWithDefaultxInstances(999);
		int i;
		int j;
		int m;
		int max = 0;
		int max_ = 0;
		int k;
		int[] amount = new int[91];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i].author = tempVar3.charAt(0);
			}
			y[i].amount = String.valueOf(y[i].author).length();
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < y[i].amount;j++)
			{
				for (k = 'A';k < 'Z';k++)
				{
					if (k = y[i].author.charAt(j) != null)
					{
						amount[k]++;
						break;
					}
				}
			}
		}
		for (i = 'A';i < 'Z';i++)
		{
			if (max < amount[i])
			{
				max = amount[i];
				max_ = i; //ASCII??max_?????????
			}
		}
		System.out.printf("%c\n",max_);
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < y[i].amount;j++)
			{
				if (y[i].author.charAt(j) == max_)
				{
					System.out.printf("%d\n",y[i].num);
				}
			}
		}

	}
}

