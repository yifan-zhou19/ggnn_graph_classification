package <missing>;

public class GlobalMembers
{
	public static void find(int m, int j, tangible.RefObject<Integer> p)
	{
		for (;j <= m;j++)
		{
					  if (m == j)
					  {
							  p.argValue++;
							  break;
					  }
					  if (m % j == 0)
					  {
						  find(m / j, j, p);
					  }
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
						int p;
						p = count;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
					tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
						find(m, 2, tempRef_p);
						p = tempRef_p.argValue;
						System.out.printf("%d\n",count);
		}

		return 0;
	}

}

