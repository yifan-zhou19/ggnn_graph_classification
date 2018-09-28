public class distant
{
	public double cross;
	public double line;
}

package <missing>;

public class GlobalMembers
{
	public static distant[] point = tangible.Arrays.initializeWithDefaultdistantInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[] s = new double[1000];
		double c;
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
					point[i].cross = Double.parseDouble(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					point[i].line = Double.parseDouble(tempVar3);
				}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++,k++)
			{
				s[k] = Math.sqrt((point[i].cross - point[j].cross) * (point[i].cross - point[j].cross) + (point[i].line - point[j].line) * (point[i].line - point[j].line));
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (s[i] < s[j])
				{
					c = s[i];
					s[i] = s[j];
					s[j] = c;
				}
			}
			i++;
		}
		 System.out.printf("%.4lf\n",s[0]);
		return 0;
	}
}

