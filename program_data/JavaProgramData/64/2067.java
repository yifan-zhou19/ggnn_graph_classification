public class dian
{
	public int x;
	public int y;
	public int z;
}
public class ju
{
	public int p1;
	public int p2;
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int t = 1;
	public static dian[] a = tangible.Arrays.initializeWithDefaultdianInstances(11);
	public static dian p = a[1];
	public static ju[] b = tangible.Arrays.initializeWithDefaultjuInstances(100);
	public static ju temp = new ju();
	public static void fsort(int k)
	{
		int i;
		for (i = k + 1; i <= t; i++)
		{
			if (b[k].d < b[i].d)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = b[k];
				temp.copyFrom(b[k]);
				b[k] = b[i];
				b[i] = temp;
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			p.x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p.y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p.z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p++;
		}
		for (i = 1; i <= n - 1; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				b[t].p1 = i;
				b[t].p2 = j;
				b[t].d = Math.pow(Math.pow(a[i].x - a[j].x, 2.0) + Math.pow(a[i].y - a[j].y, 2.0) + Math.pow(a[i].z - a[j].z, 2.0), 0.5);
				t++;
			}
		}
		t--;
		for (i = 1; i < t; i++)
		{
			fsort(i);
		}
		for (i = 1; i < t; i++)
		{
			if (b[i].d == b[i + 1].d)
			{
				if (b[i].p1 > b[i + 1].p1)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = b[i + 1];
					temp.copyFrom(b[i + 1]);
					b[i + 1] = b[i];
					b[i] = temp;
				}
				else
				{
					if (b[i].p1 == b[i + 1].p1 && b[i].p2 > b[i + 1].p2)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = b[i + 1];
						temp.copyFrom(b[i + 1]);
						b[i + 1] = b[i];
						b[i] = temp;
					}
				}
			}
		}
		for (i = 1; i <= t; i++)
		{
			System.out.printf("%.2f", "(");
			System.out.printf("%.2f", a[b[i].p1].x);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", a[b[i].p1].y);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", a[b[i].p1].z);
			System.out.printf("%.2f", ")");
			System.out.printf("%.2f", "-");
			System.out.printf("%.2f", "(");
			System.out.printf("%.2f", a[b[i].p2].x);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", a[b[i].p2].y);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", a[b[i].p2].z);
			System.out.printf("%.2f", ")");
			System.out.printf("%.2f", "=");
			System.out.printf("%.2f", b[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}



}

