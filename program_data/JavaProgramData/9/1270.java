public class patient
{
		public String ID = new String(new char[10]);
		public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void paixu(patient[] pat, int n)
	{

		patient t = new patient();
		int i;
		int k;

		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (pat[i].age < pat[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=pat[i];
					t.copyFrom(pat[i]);
					pat[i] = pat[i + 1];
					pat[i + 1] = t;
				}
			}
		}
	}

	public static int Main()
	{
		patient pat = new patient();
		patient[] oldpat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] youngpat = tangible.Arrays.initializeWithDefaultpatientInstances(100);

		int n;
		int i;
		int m = 0;
		int k = 0;

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
				pat.ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat.age = Integer.parseInt(tempVar3);
			}
			if (pat.age >= 60)
			{
				oldpat[m] = pat;
				m++;
			}
			else
			{
				youngpat[k] = pat;
				k++;
			}
		}

		paixu(oldpat, m);

		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",oldpat[i].ID);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",youngpat[i].ID);
		}

		return 0;
	}


}

