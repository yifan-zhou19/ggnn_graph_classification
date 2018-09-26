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
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	public int z1;
	public int z2;
	public double l;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] a = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(12);
	public static AnonymousClass2[] dis = tangible.Arrays.initializeWithDefaultAnonymousClass2Instances(120);
	public static AnonymousClass2 t = new AnonymousClass2();
	public static void sort(int a)
	{
		 for (int i = 0; i < a; i++)
		 {
		 for (int j = 0; j < a - 1 - i; j++)
		 {

			 if (dis[j].l < dis[j + 1].l)
			 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t= dis[j];
				 t.copyFrom(dis[j]);
				 dis[j] = dis[j + 1];
				 dis[j + 1] = t;
			 }
		 }
		 }
		 for (int i = 0; i < a; i++)
		 {
			 System.out.print("(");
			 System.out.print(dis[i].x1);
			 System.out.print(",");
			 System.out.print(dis[i].y1);
			 System.out.print(",");
			 System.out.print(dis[i].z1);
			 System.out.print(")-(");
			 System.out.print(dis[i].x2);
			 System.out.print(",");
			 System.out.print(dis[i].y2);
			 System.out.print(",");
			 System.out.print(dis[i].z2);
			 System.out.print(")=");
			 System.out.printf("%.2f", dis[i].l);
			 System.out.printf("%.2f", "\n");
		 }
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int count = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{

				dis[count].l = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
				dis[count].x1 = a[i].x;
				dis[count].x2 = a[j].x;
				dis[count].y1 = a[i].y;
				dis[count].y2 = a[j].y;
				dis[count].z1 = a[i].z;
				dis[count].z2 = a[j].z;
				count++;
			}
		}
		sort(count);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}





}

