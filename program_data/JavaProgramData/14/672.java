public class stu
{
	public int ID;
	public int Chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] zz = tangible.Arrays.initializeWithDefaultstuInstances(100000);
	public static stu mx = new stu();
	public static stu mx1 = new stu();
	public static stu mx2 = new stu();
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			zz[i].ID = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zz[i].Chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zz[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zz[i].sum = zz[i].Chinese + zz[i].math;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx = zz[0];
		mx.copyFrom(zz[0]);
		for (i = 0 ; i < n ; i++)
		{
			if (zz[i].sum > mx.sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx = zz[i];
				mx.copyFrom(zz[i]);
			}
		}
			System.out.print(mx.ID);
			System.out.print(' ');
			System.out.print(mx.sum);
			System.out.print("\n");
			mx.sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx1 = mx;
			mx1.copyFrom(mx);
			for (i = 0 ; i < n ; i++)
			{
			if (zz[i].sum > mx1.sum)
			{
					if (zz[i].ID == mx.ID)
					{
					continue;
					}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx1 = zz[i];
				mx1.copyFrom(zz[i]);
			}
			}
			System.out.print(mx1.ID);
			System.out.print(' ');
			System.out.print(mx1.sum);
			System.out.print("\n");
			mx1.sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx2 = mx1;
			mx2.copyFrom(mx1);
			for (i = 0 ; i < n ; i++)
			{
			if (zz[i].sum > mx2.sum)
			{
					if (zz[i].ID == mx.ID || zz[i].ID == mx1.ID)
					{
					continue;
					}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mx2 = zz[i];
				mx2.copyFrom(zz[i]);
			}
			}
			System.out.print(mx2.ID);
			System.out.print(' ');
			System.out.print(mx2.sum);
			System.out.print("\n");
	}
}

