public class patients
{
	public int num;
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int o;
		patients[] list = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
		patients[] young = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
		patients[] old = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			list[i].num = i;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				list[i].age = Integer.parseInt(tempVar3);
			}
		}

		y = 0;
		o = 0;

		for (i = 0;i < n;i++)
		{
			if (list[i].age >= 60)
			{
				old[o] = list[i];
				o++;
			}
			else
			{
				young[y] = list[i];
				y++;
			}
		}

		for (i = 1;i < o;i++)
		{
			for (j = 0;j < o - i;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					patients check = new patients();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: check=old[j];
					check.copyFrom(old[j]);
					old[j] = old[j + 1];
					old[j + 1] = check;
				}
			}
		}

		for (i = 0;i < o;i++)
		{
			System.out.printf("%s\n",old[i].ID);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",young[i].ID);
		}

		return 0;
	}








}

