package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int n;
		int flag = 0;
		int[] p;
		int[] q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[(n + 1)];
		q = new int[(n + 1)];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(q,0,(Integer.SIZE / Byte.SIZE));
		for (;;)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
			p[i] = 1;
			q[j]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			  if (p[i] == 0 && q[i] == n - 1)
			  {
		   System.out.printf("%d\n",i);
		   flag = 1;
			  }
		}
		if (flag == 0)
		{
		 System.out.print("NOT FOUND");
		}
	}
}

