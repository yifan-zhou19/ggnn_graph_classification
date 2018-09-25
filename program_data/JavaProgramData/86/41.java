package <missing>;

public class GlobalMembers
{
	public static int abc(int p, tangible.RefObject<Integer> x)
	{
		if (x.argValue == 0)
		{
			System.out.print("60\n");
			return 0;
		}
		if (x.argValue == 1)
		{
			if (p > 57)
			{
				System.out.printf("%d\n",p);
			}
			else
			{
				System.out.print("57\n");
			}
			return 0;
		}
		else if (p + 3 * (x.argValue-1) > 60)
		{
			x.argValue = x.argValue-1;
			return 1;
		}
		else if (p + 3 * (x.argValue-1) <= 60)
		{
			if (p > 60 - 3 * x.argValue)
			{
				System.out.printf("%d\n",p);
			}
			else
			{
				System.out.printf("%d\n",60 - 3 * x.argValue);
			}
			return 0;
		}
	}

	public static void Main(String[] args)
	{
		int i;
		int k;
		int n;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,j;
			int p;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Integer.parseInt(tempVar3);
				}
			}
		tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
			d = abc(*(p + n - 1), tempRef_n);
			n = tempRef_n.argValue;
			while (d == 1)
			{
			tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n);
				d = abc(*(p + n - 1), tempRef_n2);
				n = tempRef_n2.argValue;
			}
		}
	}
}

