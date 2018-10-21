public class data
{
	public String id = new String(new char[100]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		data[] old = tangible.Arrays.initializeWithDefaultdataInstances(1000);
		data[] young = tangible.Arrays.initializeWithDefaultdataInstances(1000);
		data temp = new data();
		int n;
		int i;
		int p = 0;
		int q = 0;
		int len1;
		int len2;
		int k;
		String id = new String(new char[100]);
		int age;
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
				id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age = Integer.parseInt(tempVar3);
			}
			if (age >= 60)
			{
				old[p].age = age;
				old[p].id = id;
				p++;
			}
			else
			{
				young[q].age = age;
				young[q].id = id;
				q++;
			}
		}
		len1 = p;
		len2 = q;
		for (k = 1;k < len1;k++)
		{
			for (i = 0;i < len1 - k;i++)
			{
				if (old[i].age < old[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=old[i+1];
					temp.copyFrom(old[i + 1]);
					old[i + 1] = old[i];
					old[i] = temp;
				}
			}
		}
		for (i = 0;i < len1;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < len2;i++)
		{
			System.out.printf("%s\n",young[i].id);
		}
		return 0;
	}










}

