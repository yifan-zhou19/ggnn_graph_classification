public class patient
{
	public String No = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] grp1 = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] grp2 = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static patient[] grp3 = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				grp1[i].No = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grp1[i].age = Integer.parseInt(tempVar3);
			}
		}
			 for (i = 0;i < n;i++)
			 {
			grp2[i].age = -1;
			grp3[i].age = -1;
			 }
			 for (i = 0;i < n;i++)
			 {
			if (grp1[i].age >= 60)
			{
				grp2[i].No = grp1[i].No;
				grp2[i].age = grp1[i].age;
			}
			if (grp1[i].age < 60)
			{
				grp3[i].No = grp1[i].No;
				grp3[i].age = grp1[i].age;
			}
			 }
			 String y = new String(new char[10]);
		int x;
		int k;
		int m;
		for (k = 1;k < n;k++)
		{
			for (m = 0;m < n - k;m++)
			{
				if (grp2[m].age < grp2[m + 1].age)
				{
					x = grp2[m + 1].age;
					grp2[m + 1].age = grp2[m].age;
					grp2[m].age = x;
					y = grp2[m + 1].No;
					grp2[m + 1].No = grp2[m].No;
					grp2[m].No = y;
				}
			}
		}
			 for (i = 0;i < n;i++)
			 {
			if (grp2[i].age != -1)
			{
				System.out.printf("%s\n",grp2[i].No);
			}
			 }
			 for (i = 0;i < n;i++)
			 {
			if (grp3[i].age != -1)
			{
				System.out.printf("%s\n",grp3[i].No);
			}
			 }
		return 0;
	}
}

