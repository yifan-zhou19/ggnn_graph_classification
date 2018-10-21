package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int a;
		int i;
		int j;
		int k;
		int y;
		int[] n = new int[100];
		int[] m = new int[100];
		int[] x = new int[100];
		for (a = 0;a < 100;a++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[a] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[a] = Integer.parseInt(tempVar2);
		}
		if (n[a] == 0 && m[a] == 0)
		{
			y = a;
			break;
		}
		}
		for (a = 0;a < y;a++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			p = (int)malloc(sizeof(int[100]) * n[a]);
			for (i = 0;i < n[a];i++)
			{
				p[i] = 0;
			}
			k = n[a];
			j = 1;
			for (i = 0;i < n[a];i = (i + 1) % n[a])
			{
				if (p[i])
				{
					continue;
				}
				if (j++==m[a])
				{
					p[i] = 1;
					k--;
					j = 1;
				}
				if (k == 0)
				{
					x[a] = i + 1;
					break;
				}
			}
		}
		for (int b = 0;b < y;b++)
		{
			System.out.printf("%d\n",x[b]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}
}

