public class point
{
		public String id = new String(new char[10]);
		public int age;
}

package <missing>;

public class GlobalMembers
{
		public static point[] old = tangible.Arrays.initializeWithDefaultpointInstances(100);
		public static point[] small = tangible.Arrays.initializeWithDefaultpointInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int o = 0;
		int s = 0;
		int t;
		int m;
	//	char x[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			final String x = "";
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if (t >= 60)
			{
				old[o].id = x;
				old[o].age = t;
				o++;

			}
			else
			{
				small[s].id = x;
				small[s].age = t;
				s++;
			}
		}
		String p = new String(new char[10]);
		for (i = 0;i < o;i++)
		{
			for (j = 1;j < o - i;j++)
			{
				if (old[i].age >= old[i + j].age)
				{
					m = old[i + j].age;
					old[i + j].age = old[i].age;
					old[i].age = m;
					p = old[i + j].id;
					old[i + j].id = old[i].id;
					old[i].id = p;
				}
			}
		}

		for (i = o - 1;i >= 0;i--)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%s\n",small[i].id);
		}
	}

}

