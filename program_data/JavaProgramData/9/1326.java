public class a60
{
	public String ID = new String(new char[10]);
	public int age;
}

public class u60
{
	public String ID = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static a60[] a60 = tangible.Arrays.initializeWithDefaulta60Instances(101);
	public static u60[] u60 = tangible.Arrays.initializeWithDefaultu60Instances(100);

	public static void sort(int n)
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		a60 * x = new a60();
		for (i = 1;i < n;i++)
		{
			for (x = a60; x < a60 + n - i; x++)
			{
				if (x.age < (x + 1).age)
				{
					a60[100] = x;
					*x = (x + 1);
					*(x + 1) = a60[100];
				}
			}
		}
	}

	public static int Main()
	{
		int a = 0;
		int b = 0;
		int m;
		int n;
		int q;
		String p = new String(new char[10]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		a60 * x = new a60();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		u60 * y = new u60();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: x=a60;
		x.copyFrom(a60);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: y=u60;
		y.copyFrom(u60);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (m = 0; m < n; m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}

			if (q >= 60)
			{
				x.ID = p;
				x.age = q;
				x++;
				a++;
			}
			else
			{
				y.ID = p;
				y.age = q;
				y++;
				b++;
			}
		}

		sort(a);

		for (x = a60; x < a60 + a; x++)
		{
			System.out.printf("%s\n", x.ID);
		}

		for (y = u60; y < u60 + b; y++)
		{
			System.out.printf("%s\n", y.ID);
		}

		return 0;
	}
}

