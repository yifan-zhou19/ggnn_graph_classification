package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int a;
		int c;
		int e;
		int x;
		int b;
		int d;
		int h;
		int k;
		int n;
		int[] m = new int[1000];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   m[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (m[i] + m[j] == x)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		A:
		if (i == n + 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}


		return 0;
	}

}

