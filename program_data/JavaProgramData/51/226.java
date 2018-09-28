public class group
{
	public String B = new String(new char[5]);
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static group[] G = tangible.Arrays.initializeWithDefaultgroupInstances(500);
	public static group temp = new group();
	public static int Main()
	{
		String A = new String(new char[504]);
		int number;
		int i;
		int j;
		int k;
		int flag;
		int n;
		int t;
		int m = 0;
		j = 0;
		for (i = 0;i < 504;i++)
		{
			G[i].n = 0;
			for (j = 0;j < 5;j++)
			{
				G[i].B = tangible.StringFunctions.changeCharacter(G[i].B, j, '\0');
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A = tempVar2.charAt(0);
		}
		number = A.length();
		j = 0;
		for (i = 0;i < number - n + 1;i++)
		{
			flag = 0;
			if (i == 0)
			{
				for (k = 0;k < n;k++)
				{
					G[j].B = tangible.StringFunctions.changeCharacter(G[j].B, k, A.charAt(k));
				}
				G[j].n++;
				j++;
			}
			else
			{
				for (k = 0;k < n;k++)
				{
					G[j].B = tangible.StringFunctions.changeCharacter(G[j].B, k, A.charAt(i + k));
					G[j].n = 1;
				}
				for (t = 0;t < j;t++)
				{
					if (strcmp(G[t].B,G[j].B) == 0)
					{
						G[t].n++;
						flag = 1;
						break;
					}
				}
				if (flag == 1)
				{
					for (k = 0;k < n;k++)
					{
						G[j].B = tangible.StringFunctions.changeCharacter(G[j].B, k, '\0');
						G[j].n = 0;
					}
				}
				else
				{
					j++;
				}
			}
		}
		for (i = 1;i < j;i++)
		{
			for (k = 0;k < j - i;k++)
			{
				if (G[k].n < G[k + 1].n)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=G[k+1];
					temp.copyFrom(G[k + 1]);
					G[k + 1] = G[k];
					G[k] = temp;
				}
			}
		}
		m = 1;

		i = 1;
		while (G[i].n == G[0].n)
		{
			i++;
			m++;
		}
	if (G[0].n == 1)
	{
	System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",G[0].n);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",G[i].B);
		}
	}
		return 0;
	}
}

