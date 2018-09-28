public class patient
{
	public String id = new String(new char[10]);
  public int year;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int arrange(patient[] peop, int num);

	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int n;
		int max;
		patient[] ppat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
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
							pat[i].id = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							pat[i].year = Integer.parseInt(tempVar3);
						}
		}
		for (i = 0;i < n;i++)
		{
						 if (pat[i].year >= 60)
						 {
											 ppat[j] = pat + i;
											 j++;
						 }
		}

		patient p;
		for (i = 0;i < j - 1;i++)
		{
						  for (k = 0;k < j - 1 - i;k++)
						  {
											 if ((ppat[k]).year < (ppat[k + 1]).year)
											 {
																p = ppat[k];
																ppat[k] = ppat[k + 1];
																ppat[k + 1] = p;
											 }
						  }
		}

		for (i = 0;i < j;i++)
		{
						System.out.printf("%s\n",ppat[i].id);
		}
		for (i = 0;i < n;i++)
		{
						 if (pat[i].year < 60)
						 {
										   System.out.printf("%s\n",pat[i].id);
						 }
		}
		return 0;
	}

}

