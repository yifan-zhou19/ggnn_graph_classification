public class qujian
{
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static qujian[] qj = tangible.Arrays.initializeWithDefaultqujianInstances(50000);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int left;
		int right;
		int k;
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
				qj[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qj[i].b = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (qj[i].a > qj[j].a)
				{
					temp = qj[i].a;
					qj[i].a = qj[j].a;
					qj[j].a = temp;
					temp = qj[i].b;
					qj[i].b = qj[j].b;
					qj[j].b = temp;
				}
			}
		}
		left = qj[0].a;
		right = qj[0].b;
		k = 1;
		while (k > 0)
		{
			if (k == n)
			{
				System.out.printf("%d %d\n",left,right);
				break;
			}
			else
			{
				if (qj[k].a > right)
				{
					System.out.print("no\n");
					break;
				}
				else
				{
					if (qj[k].a < left)
					{
						left = qj[k].a;
					}
					if (qj[k].b > right)
					{
						right = qj[k].b;
					}
					k++;
				}
			}
		}
		return 0;
	}





}

