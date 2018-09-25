public class person
{
	public String id = new String(new char[20]);
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int k = 0;
		person t = new person();
		person[] s;
		person[] o = tangible.Arrays.initializeWithDefaultpersonInstances(1000);
		person[] y = tangible.Arrays.initializeWithDefaultpersonInstances(1000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = tangible.Arrays.initializeWithDefaultpersonInstances(n);
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i].id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s[i].y = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].y >= 60)
			{
			o[k] = s[i];
			k++;
			}
			else
			{
				y[m] = s[i];
				m++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (o[j].y < o[j + 1].y)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=o[j];
				t.copyFrom(o[j]);
				o[j] = o[j + 1];
				o[j + 1] = t;
				}
			}

		}
			for (i = 0;i < k;i++)
			{
					System.out.printf("%s\n",o[i].id);
			}

		for (i = 0;i < m;i++)
		{
	 System.out.printf("%s\n",y[i].id);
		}

	}

}

