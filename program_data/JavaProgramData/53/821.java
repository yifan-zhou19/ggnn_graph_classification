package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,n,i,j,num=0,b[300],shu=-1;
		int p;
		int n;
		int i;
		int j;
		int num = 0;
		int[] b = new int[300];
		int shu = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p + i) == *(p + j))
				{
					break;
				}
				else
				{
					num++;
				}
			}
			if (num == i)
			{
				shu++;
				b[shu] = (p + i);
			}
			num = 0;
		}
		for (i = 0;i < shu;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[shu]);

	return 0;
	}

}

