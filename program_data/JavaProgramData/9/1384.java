public class Info
{
	public String sID = new String(new char[10]);
	public int nAge;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int l;
		Info t = new Info();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Info[] patients = tangible.Arrays.initializeWithDefaultInfoInstances(100);
		Info[] overpatients = tangible.Arrays.initializeWithDefaultInfoInstances(100);
		l = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patients[i].sID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patients[i].nAge = Integer.parseInt(tempVar3);
			}
			if (patients[i].nAge >= 60)
			{ //?????60?????????
				overpatients[l] = patients[i];
				l++;
			}
		}
		for (i = 0;i < l - 1;i++)
		{
			for (j = 1;j < l - i;j++)
			{
				if (overpatients[j - 1].nAge < overpatients[j].nAge)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=overpatients[j-1];
					t.copyFrom(overpatients[j - 1]);
					overpatients[j - 1] = overpatients[j];
					overpatients[j] = t;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%s\n",overpatients[i].sID);
		}
		for (i = 0;i < n;i++)
		{
			if (patients[i].nAge < 60)
			{
				System.out.printf("%s\n",patients[i].sID);
			}
		}
	}


}

