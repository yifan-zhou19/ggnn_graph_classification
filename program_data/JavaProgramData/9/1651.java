public class patients
{
	public String name = new String(new char[11]);
	public int age;
}
public class patold
{
	public String name = new String(new char[11]);
	public int age;
}
public class patyoung
{
	public String name = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static patients[] pat = tangible.Arrays.initializeWithDefaultpatientsInstances(100);
	public static patold[] old = tangible.Arrays.initializeWithDefaultpatoldInstances(100);
	public static patyoung[] young = tangible.Arrays.initializeWithDefaultpatyoungInstances(100);
	public static int y = 0;
	public static int o = 0;
	public static String nametemp = new String(new char[11]);
	public static int agetemp;

	public static int Main()
	{
		int i;
		int j;
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
				pat[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				old[o].name = pat[i].name;
				old[o].age = pat[i].age;
				o++;
			}
			else
			{
				young[y].name = pat[i].name;
				young[y].age = pat[i].age;
				y++;
			}
		}
		for (i = 1;i < o;i++)
		{
			for (j = 0;j < o - i;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					agetemp = old[j].age;
					old[j].age = old[j + 1].age;
					old[j + 1].age = agetemp;
					nametemp = old[j].name;
					old[j].name = old[j + 1].name;
					old[j + 1].name = nametemp;
				}
			}
		}
		for (i = 0;i < o;i++)
		{
			System.out.printf("%s\n",old[i].name);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",young[i].name);
		}
		return 0;
	}
}

