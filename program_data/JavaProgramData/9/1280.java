public class people
{
	public int order;
	public String ID = new String(new char[10]);
	public int age;
}
public class old
{
	public int orders;
	public String IDs = new String(new char[10]);
	public int ages;
}

package <missing>;

public class GlobalMembers
{
	public static people[] per = tangible.Arrays.initializeWithDefaultpeopleInstances(100);
	public static old[] elder = tangible.Arrays.initializeWithDefaultoldInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int m;
		int q;
		int r;
		String p = new String(new char[10]);
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			per[i].order = i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				per[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				per[i].age = Integer.parseInt(tempVar3);
			}
			b[i] = String.valueOf(per[i].ID).length();
		}
		t = 0;
		for (i = 0;i <= (n - 1);i++)
		{
			if (per[i].age >= 60)
			{
				elder[t].orders = t;
				elder[t].IDs = per[i].ID;
				elder[t].ages = per[i].age;
				t = t + 1;
				per[i].age = (-1);
			}
		}
		for (i = 0;i <= (t - 1);i++)
		{
			for (j = 0;j <= (t - i - 1);j++)
			{
				if (elder[j].ages < elder[j + 1].ages)
				{
					m = elder[j].ages;
					p = elder[j].IDs;
					q = elder[j].orders;
					elder[j].IDs = elder[j + 1].IDs;
					elder[j].ages = elder[j + 1].ages;
					elder[j].orders = elder[j + 1].orders;
					elder[j + 1].ages = m;
					elder[j + 1].IDs = p;
					elder[j + 1].orders = q;
				}
			}
		}
		for (i = 0;i <= (t - 1);i++)
		{
		   for (j = 0;j <= (t - 1 - j);j++)
		   {
			   if (elder[j].ages == elder[j + 1].ages)
			   {
				   if (elder[j].orders > elder[j + 1].orders)
				   {
						m = elder[j].ages;
						p = elder[j].IDs;
						q = elder[j].orders;
						elder[j].IDs = elder[j + 1].IDs;
						elder[j].ages = elder[j + 1].ages;
						elder[j].orders = elder[j + 1].orders;
						elder[j + 1].ages = m;
						 elder[j + 1].IDs = p;
						elder[j + 1].orders = q;
				   }
			   }
		   }
		}
		for (i = 0;i <= (t - 1);i++)
		{
			 System.out.printf("%s\n",elder[i].IDs);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (per[i].age != (-1))
			{
				System.out.printf("%s\n",per[i].ID);
			}
		}
		return 0;
	}

}

