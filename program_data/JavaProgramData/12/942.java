package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int geshu;
		int get;
		int n = 0;
		int[] shuzu = new int[15];
		for (j = 0;;j++)
		{
			n = 0;
			for (i = 0;;i++)
			{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			get = Integer.parseInt(tempVar);
		}
			if (get == -1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
			}
			shuzu[i] = get;
			if (get == 0)
			{
				geshu = i;
			break;
			}
			}
		for (k = 0;k < geshu;k++)
		{
			for (l = 0;l < geshu;l++)
			{
				if (shuzu[k] == 2 * shuzu[l])
				{
					n = n + 1;
				}
			}
		}
		System.out.printf("%d\n",n);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}

}

