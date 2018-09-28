package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int f = 1;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct P
	//	{
	//		int known;
	//		int know;
	//	};
		P[] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultPInstances(n);

		for (i = 0; i < n; i++)
		{
			p[i].know = 0;
			p[i].known = 0;
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (; !(a == 0 && b == 0);)
		{
			p[a].know++;
			p[b].known++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0; i < n; i++)
		{
			if ((p[i].know < n - 1) && (p[i].known == n - 1))
			{
				f = 0;
				System.out.printf("%d",i);
			}
		}
		if (f != 0)
		{
			System.out.print("NOT FOUND\n");
		}
	}

}

