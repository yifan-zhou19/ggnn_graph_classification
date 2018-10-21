//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public float a;
	public int f;
	public int g;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] s = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(50);
	public static AnonymousClass temp = new AnonymousClass();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		int t = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[t].a = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				s[t].f = i;
				s[t].g = j;
				t++;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - i - 1;j++)
			{
				if (s[j].a < s[j + 1].a)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=s[j];
					temp.copyFrom(s[j]);
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[s[i].f],y[s[i].f],z[s[i].f],x[s[i].g],y[s[i].g],z[s[i].g],s[i].a);
		}
	}
}

