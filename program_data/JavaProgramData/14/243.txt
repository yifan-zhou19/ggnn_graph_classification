public class xue
{
	public int ID;
	public int sx;
	public int yw;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static xue xueshen = new xue();

	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		xue[] xuesheng;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		xuesheng = (xue)malloc(4 * (Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuesheng[i].ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xuesheng[i].sx = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				xuesheng[i].yw = Integer.parseInt(tempVar4);
			}
			xuesheng[i].sum = xuesheng[i].sx + xuesheng[i].yw;
		}
		for (i = 1;i < 4;i++)
		{
			for (k = 0;k < n - i;k++)
			{
				if (xuesheng[k].sum >= xuesheng[k + 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: xueshen=xuesheng[k+1];
					xueshen.copyFrom(xuesheng[k + 1]);
					xuesheng[k + 1] = xuesheng[k];
					xuesheng[k] = xueshen;
				}
			}
		}
		for (i = 1;i < 4;i++)
		{
			System.out.printf("%d %d\n",xuesheng[n - i].ID,xuesheng[n - i].sum);
		}
		return 0;
	}


}

