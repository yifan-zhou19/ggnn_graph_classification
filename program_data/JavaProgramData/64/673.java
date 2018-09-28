public class point
{ //?????point?????
	public int x;
	public int y;
	public int z;
}
public class data
{ //?????data????????
	public int num;
	public point a = new point(); //?1
	public point b = new point(); //?2
	public double distance; //??
}

package <missing>;

public class GlobalMembers
{
	public static point[] pt = tangible.Arrays.initializeWithDefaultpointInstances(50);
	public static data[] dt = tangible.Arrays.initializeWithDefaultdataInstances(10000);
	public static data temp = new data();
	public static int Main()
	{
		int n; //????n????i?j
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //???????
		{
			pt[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pt[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pt[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int t = 0; //??dt??
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dt[t].num = t;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dt[t].a=pt[i];
				dt[t].a.copyFrom(pt[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dt[t].b=pt[j];
				dt[t].b.copyFrom(pt[j]);
				dt[t].distance = Math.sqrt((pt[i].x - pt[j].x) * (pt[i].x - pt[j].x) + (pt[i].y - pt[j].y) * (pt[i].y - pt[j].y) + (pt[i].z - pt[j].z) * (pt[i].z - pt[j].z)); //????
				t++;
			}
		}
		int k; //??dt??
		k = t;
		for (i = 0;i < k;i++) //??
		{
			for (j = i + 1;j < k;j++)
			{
				if (dt[i].distance < dt[j].distance || (dt[i].distance == dt[j].distance && dt[i].num> dt[j].num))
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dt[i];
					temp.copyFrom(dt[i]);
					dt[i] = dt[j];
					dt[j] = temp;
				}
			}
		}
		for (i = 0;i < k;i++) //??
		{
			System.out.print("(");
			System.out.print(dt[i].a.x);
			System.out.print(",");
			System.out.print(dt[i].a.y);
			System.out.print(",");
			System.out.print(dt[i].a.z);
			System.out.print(")-(");
			System.out.print(dt[i].b.x);
			System.out.print(",");
			System.out.print(dt[i].b.y);
			System.out.print(",");
			System.out.print(dt[i].b.z);
			System.out.print(")=");
			System.out.printf("%.2lf\n",dt[i].distance);
		}
		return 0;
	}


}

