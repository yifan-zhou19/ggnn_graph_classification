public class patient
{
	public String id = new String(new char[10]);
	public int old;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pt = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int e;
		int h;
		int[] yx = new int[100];
		int[] byx = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pt[i].old = Integer.parseInt(tempVar3);
			}
			if (pt[i].old >= 60)
			{
				yx[j] = i;
				j++;
			}
			else
			{
				byx[k] = i;
				k++;
			}

		}

		for (i = 0;i < j;i++)
		{
			for (h = 0;h < j - 1;h++)
			{
				if (pt[yx[h]].old < pt[yx[h + 1]].old)
				{
					e = yx[h];
					yx[h] = yx[h + 1];
					yx[h + 1] = e;
				}
			}
		}

		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",pt[yx[i]].id);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",pt[byx[i]].id);
		}
	}

}

