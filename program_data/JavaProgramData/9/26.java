package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		char a[10];
	//		int year;
	//	};
		people[] b = tangible.Arrays.initializeWithDefaultpeopleInstances(100); //yuan  hou
		people[] c = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
		people[] d = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
		people[] v = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
		for (int h = 0;h <= 99;h++)
		{
			for (int p = 0;p <= 9;p++)
			{
				b[h].a[p] = c[h].a[p] = d[h].a[p] = v[h].a[p] = 0;
			}
		}

		int n; //lao ren shu
		int t = 0;
		int k = 0;
		int o;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].year = tempVar3;
			}
			if (b[i].year >= 60)
			{
				t++;
				v[t] = b[i];
			}
			else
			{
				k++;
				d[k] = b[i];
			}
		}
		for (int j = 1;j <= t;j++)
		{
						 o = 0;
			for (int u = 1;u <= t;u++)
			{

				if (v[u].year > v[j].year)
				{
					o++;
				}
				if (v[u].year == v[j].year && u < j)
				{
					o++;
				}
			}
			c[o + 1] = v[j];
		}
		for (int l = 1;l <= k;l++)
		{
			c[t + l] = d[l];
		}
		for (int x = 1;x <= n;x++)
		{
			System.out.printf("%s\n",c[x].a);
		}

	}


}

