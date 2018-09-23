//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
	public class AnonymousClass
	{
	public int x;
	public int y;
	public int s;
	public int z;
	}

package <missing>;

public class GlobalMembers
{
		public static AnonymousClass[] a = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100010);
		public static AnonymousClass t = new AnonymousClass();

	public static int Main()
	{

		int n;
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
				a[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].s = Integer.parseInt(tempVar4);
			}
			a[i].z = a[i].y + a[i].s;
		}
		for (i = 0;i <= 2;i++)
		{
			for (j = n - 1;j >= i;j--)
			{
				if (a[j + 1].z > a[j].z)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[j];
					t.copyFrom(a[j]);
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	System.out.printf("%d %d\n",a[0].x,a[0].z);
	System.out.printf("%d %d\n",a[1].x,a[1].z);
	System.out.printf("%d %d\n",a[2].x,a[2].z);
	return 0;
	}

}

