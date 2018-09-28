//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
		public String ID = new String(new char[10]);
		public int nian;
}

package <missing>;

public class GlobalMembers
{
		public static AnonymousClass[] patient = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);
		public static AnonymousClass[] old = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);
		public static AnonymousClass[] qita = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);
		public static AnonymousClass temp = new AnonymousClass();
	public static int Main()
	{
	int n;
	int i;
	int k;
	int e;
	int num;
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
		patient[i].ID = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		patient[i].nian = Integer.parseInt(tempVar3);
	}
	}
	num = 0;
	for (i = 0;i < n;i++)
	{
			if (patient[i].nian >= 60)
			{
				num = num + 1;
			}
	}
	k = 0;
	for (i = 0;i < n;i++)
	{
		if (patient[i].nian >= 60)
		{
		old[k] = patient[i];
		k = k + 1;
		}
	}
	k = 0;
	for (i = 0;i < n;i++)
	{
		if (patient[i].nian < 60)
		{
		qita[k] = patient[i];
		k = k + 1;
		}
	}
	for (j = 1;j < num;j++)
	{
		for (k = 0;k < num - j;k++)
		{
			if (old[k + 1].nian > old[k].nian)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=old[k+1];
				temp.copyFrom(old[k + 1]);
				old[k + 1] = old[k];
				old[k] = temp;
			}
		}
	}
	for (k = 0;k < num;k++)
	{
		System.out.printf("%s\n",old[k].ID);
	}
	for (k = 0;k < n - num;k++)
	{
		System.out.printf("%s\n",qita[k].ID);
	}
		return 0;
	}
}

