public class patient
{
	public String id = new String(new char[10]);
	public int old;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pa = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int t;
		patient[] pao = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient[] pay = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		patient temp = new patient();
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
				pa[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].old = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (pa[i].old >= 60)
			{
				pao[j] = pa[i];
					j++;
			}
			else
			{
				pay[k] = pa[i];
				k++;
			}
		}

		for (i = 0;i < j - 1;i++)
		{
			for (t = 0;t < j - 1 - i;t++)
			{
				if (pao[t].old < pao[t + 1].old)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=pao[t];
					temp.copyFrom(pao[t]);
					pao[t] = pao[t + 1];
					pao[t + 1] = temp;
				}
			}
		}

		System.out.printf("%s",pao[0].id);
		for (i = 1;i < j;i++)
		{
			System.out.printf("\n%s",pao[i].id);
		}
		System.out.printf("\n%s",pay[0].id);
		for (i = 1;i < k;i++)
		{
			System.out.printf("\n%s",pay[i].id);
		}
	}
}

