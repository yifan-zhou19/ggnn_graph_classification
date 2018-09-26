package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] p;
		int i;
		int j;
		int k;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				break;
			}
			else if (n == 1)
			{
				System.out.print("1\n");
			}

			else
			{
				p = new int[(n)];
		for (i = 0;i < n;i++)
		{
			p[i] = 0;
		}
		k = n;
		j = 1;
		for (i = 0;i < n;i = (i + 1) % n)
		{

			if (p[i] != 0)
			{
				continue;
			}

			if (j++==m)
			{
				k--;
				p[i] = 1;
				j = 1;
			}

			if (k == 0)
			{
				System.out.printf("%d\n",i + 1);
				break;
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
			}
		}
	return;
	}

}

