public class zimu
{
	public char a;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int i;
		int j;
		int k = 0;
		int n;
		int h = 1;
		int sum = 1;
		zimu[] shu = tangible.Arrays.initializeWithDefaultzimuInstances(400);
		zimu t = new zimu();
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z')
			{
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						sum++;
						a = a.substring(0, j);
					}
				}
				shu[k].a = a.charAt(i);
				shu[k].sum = sum;
				h = 0;
				k++;
				sum = 1;
			}
		}
		if (h == 0)
		{
			for (i = 1;i <= k - 1;i++)
			{
				for (j = 0;j < k - 1;j++)
				{
					if (shu[j].a > shu[j + 1].a)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=shu[j];
						t.copyFrom(shu[j]);
						shu[j] = shu[j + 1];
						shu[j + 1] = t;
					}
				}
			}
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c=%d\n",shu[i].a,shu[i].sum);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if ('a' <= a.charAt(i) && a.charAt(i) <= 'z')
			{
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						sum++;
						a = a.substring(0, j);
					}
				}
				shu[k].a = a.charAt(i);
				shu[k].sum = sum;
				h = 2;
				k++;
				sum = 1;
			}
		}
		if (h == 2)
		{
			for (i = 1;i <= k - 1;i++)
			{
				for (j = 0;j < k - 1;j++)
				{
					if (shu[j].a > shu[j + 1].a)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=shu[j];
						t.copyFrom(shu[j]);
						shu[j] = shu[j + 1];
						shu[j + 1] = t;
					}
				}
			}
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c=%d\n",shu[i].a,shu[i].sum);
			}
		}
		if (h == 1)
		{
			System.out.print("No\n");
		}
		return 0;
	}



}

