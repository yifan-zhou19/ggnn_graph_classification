//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int x;
	public int y;
	public int z;
}
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass2:
public class AnonymousClass2
{
	public int f1;
	public int f2;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] dot = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(10);
	public static AnonymousClass2[] d = tangible.Arrays.initializeWithDefaultAnonymousClass2Instances(55);
	public static AnonymousClass2 t = new AnonymousClass2();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c = 0;
		int x1;
		int y1;
		int z1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			dot[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				x1 = (dot[i].x - dot[j].x) * (dot[i].x - dot[j].x);
				y1 = (dot[i].y - dot[j].y) * (dot[i].y - dot[j].y);
				z1 = (dot[i].z - dot[j].z) * (dot[i].z - dot[j].z);
				d[c].f1 = i;
				d[c].f2 = j;
				d[c++].dis = Math.sqrt(x1 + y1 + z1);
			}
		}
		for (i = 0; i < c; i++)
		{
			for (j = c - 1; j > i; j--)
			{
				if (d[j].dis > d[j - 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = d[j - 1];
					t.copyFrom(d[j - 1]);
					d[j - 1] = d[j];
					d[j] = t;
				}
			}
		}
		for (i = 0; i < c; i++)
		{
			System.out.print('(');
			System.out.print(dot[d[i].f1].x);
			System.out.print(',');
			System.out.print(dot[d[i].f1].y);
			System.out.print(',');
			System.out.print(dot[d[i].f1].z);
			System.out.print(")-(");
			System.out.print(dot[d[i].f2].x);
			System.out.print(',');
			System.out.print(dot[d[i].f2].y);
			System.out.print(',');
			System.out.print(dot[d[i].f2].z);
			System.out.print(")=");
			System.out.printf("%.2f", d[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

