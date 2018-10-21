package <missing>;

public class GlobalMembers
{
	// #define SKIP_HORSERACING


	public static int cmp(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *aa = (int*)a, *bb = (int*)b;
		int aa = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *bb = (int*)b;
		int bb = (int)b;
		return bb - aa;
	}

	public static int Main()
	{
		int n;
		int[] yourspeed = new int[1000];
		int[] myspeed = new int[1000];
		int[] match = new int[1000];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (int i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					myspeed[i] = Integer.parseInt(tempVar2);
				}
			}
			for (int i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					yourspeed[i] = Integer.parseInt(tempVar3);
				}
			}

			qsort(myspeed, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(yourspeed, n, (Integer.SIZE / Byte.SIZE), cmp);

			int cnt = 0;
			int myfirst = 0;
			int mylast = n - 1;
			int yourfirst = 0;
			int yourlast = n - 1;
			while (myfirst <= mylast)
			{
				if (myspeed[myfirst] <= yourspeed[yourfirst] != 0 && myspeed[mylast] <= yourspeed[yourlast])
				{
					match[mylast--] = yourfirst++;
				}
				else if (myspeed[myfirst] > yourspeed[yourfirst])
				{
					match[myfirst++] = yourfirst++;
				}
				else
				{
					match[mylast--] = yourlast--;
				}
			}
			for (int i = 0; i < n; i++)
			{
				if (myspeed[i] > yourspeed[match[i]])
				{
					cnt++;
				}
				else if (myspeed[i] < yourspeed[match[i]])
				{
					cnt--;
				}
			}


			int gain = 200 * cnt;
			System.out.printf("%d\n", gain);
		}
		return 0;
	}


}

