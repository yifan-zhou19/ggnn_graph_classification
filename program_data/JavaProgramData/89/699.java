package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int[] c = new int[10000];
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	sd:
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			t2 = Integer.parseInt(tempVar3);
		}
		if ((t1 + t2) != 0)
		{
			c[t1]--;
			c[t2]++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto sd;
		}
		for (t = 0;t <= n - 1;t++)
		{
			if (c[t] == n - 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto s;
			}
			else if (t == n - 1)
			{
				System.out.print("NOT FOUND\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto ss;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	s:
		System.out.printf("%d\n",t);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ss:
		//printf("%d %d %d\n",n,c[0],c[1]);
		return 0;
	}
}

