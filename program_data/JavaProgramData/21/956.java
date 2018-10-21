public class num
{
	public int n;
	public float d;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		float aver;
		num[] nob = tangible.Arrays.initializeWithDefaultnumInstances(300);
		num temp = new num();
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
				nob[i].n = Integer.parseInt(tempVar2);
			}
			sum += nob[i].n;
		}
		aver = (sum * 1.0) / (n * 1.0);
		for (i = 0;i < n;i++)
		{
			nob[i].d = nob[i].n > aver != 0?(nob[i].n - aver):(aver - nob[i].n);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (nob[j].d < nob[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=nob[j];
					temp.copyFrom(nob[j]);
					nob[j] = nob[j + 1];
					nob[j + 1] = temp;
				}
			}
		}

		sum = 1;
		for (i = 1;i < n;i++)
		{
			if (nob[0].d == nob[i].d)
			{
				sum++;
			}
			else
			{
				break;
			}
		}
		if (sum == 1)
		{
			System.out.printf("%d\n",nob[0].n);
		}
		else
		{
			for (i = 0;i < sum - 1;i++)
			{
				for (j = 0;j < sum - 1 - i;j++)
				{
				if (nob[j].n > nob[j + 1].n)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=nob[j];
					temp.copyFrom(nob[j]);
					nob[j] = nob[j + 1];
					nob[j + 1] = nob[j];
				}
				}
			}
		System.out.printf("%d",nob[0].n);
		for (i = 1;i < sum;i++)
		{
			System.out.printf(",%d",nob[i].n);
		}
		}
		return 0;
	}


}

