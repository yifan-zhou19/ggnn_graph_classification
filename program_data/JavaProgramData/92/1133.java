package <missing>;

public class GlobalMembers
{
	public static int comp(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p11=(int*)p1;
		int p11 = (int)p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p22=(int*)p2;
		int p22 = (int)p2;
		return p11 - p22;
	}

	public static int Main()
	{
		int n;
		int[] hq = new int[1010];
		int[] ht = new int[1010];
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0;i != n;++i)
			{
				ht[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i != n;++i)
			{
				hq[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(ht,n,(Integer.SIZE / Byte.SIZE),comp);
			qsort(hq,n,(Integer.SIZE / Byte.SIZE),comp);
			int it = 0;
			int iq = 0;
			int jt = n - 1;
			int jq = n - 1;
			int result = 0;
			for (int i = 0;i != n;++i)
			{
				if (ht[jt] > hq[jq])
				{
					--jt,--jq;
					result += 200;
				}
				else if (ht[it] > hq[iq])
				{
					++it,++iq;
					result += 200;
				}
				else
				{
					if (ht[it] < hq[jq])
					{
						result -= 200;
					}
					++it,--jq;
				}
			}
		System.out.print(result);
		System.out.print("\n");

		}
		return 0;
	}
}

