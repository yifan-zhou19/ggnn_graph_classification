public class area
{
	public int start;
	public int end;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		area[] area = tangible.Arrays.initializeWithDefaultareaInstances(50002);
		area temp = new area();
		int n;
		int i;
		int j;
		int s;
		int e;
		int flag = 0;
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
				area[i].start = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				area[i].end = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (area[i].start > area[j].start)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=area[i];
					temp.copyFrom(area[i]);
					area[i] = area[j];
					area[j] = temp;
				}
			}
		}
			s = area[0].start;
			e = area[0].end;
		for (i = 0;i < n;i++)
		{
			if (area[i].start > e)
			{

				flag = 1;
								break;
			}
			else if (area[i].start <= e != 0 && e <= area[i].end)
			{
				e = area[i].end;
			}
		}
		if (flag != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d\n",s,e);
		}
	}


}

