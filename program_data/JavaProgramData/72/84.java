package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] p = new int[22];
		int i;
		int j;
		int a;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int [22])calloc(22,22 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i < a + 1;i++)
		{
			for (j = 1;j < b + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 1;j <= b;j++)
			{
				if (*(p[i] + j) >= *(p[i - 1] + j) && *(p[i] + j) >= *(p[i + 1] + j) && *(p[i] + j) >= *(p[i] + j + 1) && *(p[i] + j) >= *(p[i] + j - 1))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}

}

