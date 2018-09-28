public class patient
{
		public String id = new String(new char[10]);
		public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void bubble(patient[] p, int m)
	{
		int i;
		int j;
		patient temp = new patient();
		for (j = 101;j < m;j++)
		{
			for (i = 100;i < m + 100 - j;i++)
			{
				if (p[i].age < p[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=p[i];
					temp.copyFrom(p[i]);
					p[i] = p[i + 1];
					p[i + 1] = temp;
				}
			}
		}
	}
	public static void Main()
	{

		patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(200);
		int n;
		int i;
		int t = 100;
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
				p[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			if (p[i].age >= 60)
			{
				p[t] = p[i];
				t++;
				p[i].age = 0;
			}
		}
		bubble(p, t);
		for (i = 100;i < t;i++)
		{
			System.out.printf("%s\n",p[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age != 0)
			{
				System.out.printf("%s\n",p[i].id);
			}
		}
	}






}

