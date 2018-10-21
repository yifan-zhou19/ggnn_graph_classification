package <missing>;

public class GlobalMembers
{
	public static int[] p = new int[5];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int temp;
	public static int c;
	public static int trans()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int [5])calloc(5,5 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i] + j = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m < 5 && n < 5)
		{
			for (j = 0;j < 5;j++)
			{
				temp = (p[m] + j);
			 *(p[m] + j) = *(p[n] + j);
			 *(p[n] + j) = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		c = trans();
		if (c != 0)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
				   System.out.printf("%d ",*(p[i] + j));
				}
				System.out.printf("%d\n",*(p[i] + 4));
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

