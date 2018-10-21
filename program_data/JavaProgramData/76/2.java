public class array
{
	public int s;
	public int e;
}

package <missing>;

public class GlobalMembers
{
	public static array[] array = tangible.Arrays.initializeWithDefaultarrayInstances(50000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int end;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(array[i].s) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(array[i].e) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (array[i].s > array[j].s)
				{
					t = array[i].s;
					array[i].s = array[j].s;
					array[j].s = t;
					t = array[i].e;
					array[i].e = array[j].e;
					array[j].e = t;
				}
			}
		}
		t = 0;
		end = array[0].e;
		for (i = 0;i < n;i++)
		{
			if (end >= array[i].s)
			{
				if (end < array[i].e)
				{
					end = array[i].e;
				}

			}
			else
			{
				t = 1;
				break;
			}
		}
		if (t == 1)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",array[0].s,end);
		}
		return 0;
	}
}

