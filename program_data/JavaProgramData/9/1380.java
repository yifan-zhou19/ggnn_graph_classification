public class patient
{
	public String name = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient e = new patient();
	public static patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] young = tangible.Arrays.initializeWithDefaultpatientInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int o = -1;
		int y = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] young = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			if ((p[i].age) >= 60)
			{
				o++;
				old[j] = p[i];
				j++;

			}
			else
			{
				y++;
				young[k] = p[i];
				k++;

			}
		} //?????
		for (i = 120;i >= 60;i--)
		{
			for (j = 0;j < o + 1;j++)
			{
				if (old[j].age == i)
				{
					System.out.printf("%s\n",old[j].name);
				}
			}
		} //?????????? ? ??????????????
		for (i = 0;i < y + 1;i++)
		{
			System.out.printf("%s\n",young[i].name);
		}
		return 0;
	}
}

