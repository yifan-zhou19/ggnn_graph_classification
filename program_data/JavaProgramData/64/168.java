public class point
{
	public double x;
	public double y;
	public double z;
}
public class range
{
	public double[] a = new double[3];
	public double[] b = new double[3];
	public double x;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	point[] points = tangible.Arrays.initializeWithDefaultpointInstances(10);
	range[] ranges = tangible.Arrays.initializeWithDefaultrangeInstances(200);
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	points[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	points[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	points[i].z = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	int k = 0;
	for (int i = 0;i < n;i++)
	{
	for (int j = i + 1;j < n;j++)
	{
	ranges[k].x = Math.sqrt(Math.pow((points[i].x - points[j].x),2) + Math.pow((points[i].y - points[j].y),2) + Math.pow((points[i].z - points[j].z),2));
	ranges[k].a[0] = points[i].x;
	ranges[k].a[1] = points[i].y;
	ranges[k].a[2] = points[i].z;
	ranges[k].b[0] = points[j].x;
	ranges[k].b[1] = points[j].y;
	ranges[k].b[2] = points[j].z;
	k++;
	}
	}
	range temp = new range();
	for (int i = 0;i <= k;i++)
	{
	for (int j = 0;j <= k - i;j++)
	{
	if (ranges[j].x < ranges[j + 1].x)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=ranges[j];
	temp.copyFrom(ranges[j]);
	ranges[j] = ranges[j + 1];
	ranges[j + 1] = temp;
	}
	}
	}
	for (int i = 0;i < k;i++)
	{
	System.out.printf("%f", '(');
	System.out.printf("%f", ranges[i].a[0]);
	System.out.printf("%f", ',');
	System.out.printf("%f", ranges[i].a[1]);
	System.out.printf("%f", ',');
	System.out.printf("%f", ranges[i].a[2]);
	System.out.printf("%f", ')');
	System.out.printf("%f", '-');
	System.out.printf("%f", '(');
	System.out.printf("%f", ranges[i].b[0]);
	System.out.printf("%f", ',');
	System.out.printf("%f", ranges[i].b[1]);
	System.out.printf("%f", ',');
	System.out.printf("%f", ranges[i].b[2]);
	System.out.printf("%f", ')');
	System.out.printf("%f", '=');
	System.out.printf("%.2f", ranges[i].x);
	System.out.printf("%.2f", "\n");
	}




	}

}

