package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] p;
		int n;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == k)
			{
				continue;
			}
			else
			{
				System.out.printf("%d",p[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (p[j] == k)
			{
				continue;
			}
			else
			{
				System.out.printf(" %d",p[j]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}

}

