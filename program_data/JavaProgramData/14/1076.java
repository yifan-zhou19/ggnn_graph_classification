public class stud
{
	public int n;
	public int m;
	public int c;
	public int t;
}

package <missing>;

public class GlobalMembers
{
	public static stud[] s = tangible.Arrays.initializeWithDefaultstudInstances(100000);
	public static stud temp = new stud();
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
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
				s[i].n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].c = Integer.parseInt(tempVar4);
			}
			s[i].t = s[i].m + s[i].c;
		}
		for (j = 0;j < 3 && j < n;j++)
		{
			for (k = j + 1,p = j;k < n;k++)
			{
				if (s[p].t < s[k].t)
				{
				p = k;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=s[j];
				temp.copyFrom(s[j]);
				s[j] = s[p];
				s[p] = temp;
			System.out.printf("%d %d\n",s[j].n,s[j].t);
		}
	}
}

