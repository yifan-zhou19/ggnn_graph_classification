public class zuobiao
{
	public int left;
	public int right;
}

package <missing>;

public class GlobalMembers
{
	public static zuobiao[] zuo = tangible.Arrays.initializeWithDefaultzuobiaoInstances(50000);
	public static zuobiao e = new zuobiao();
	public static int Main()
	{
		int t;
		int i;
		int j;
		int releft;
		int reright;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zuo[i].left = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				zuo[i].right = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < t;i++)
		{
			for (j = 0;j < t - i;j++)
			{
				if (zuo[j].left > zuo[j + 1].left)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=zuo[j];
					e.copyFrom(zuo[j]);
					zuo[j] = zuo[j + 1];
					zuo[j + 1] = e;
				}
			}
		}
				releft = zuo[0].left;
				reright = zuo[0].right;
				i = 1;
				while (i < t)
				{
					if (zuo[i].left > reright)
					{
						System.out.print("no\n");
						break;
					}
					else if (zuo[i].left <= reright != 0 && zuo[i].right >= reright)
					{
						reright = zuo[i].right;
					}
					i++;
				}
				if (i == t)
				{
					System.out.printf("%d %d\n",releft,reright);
				}


		return 0;
	}
}

