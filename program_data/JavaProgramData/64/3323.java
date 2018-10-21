//**********************************************************
//*  ?????1.cpp                                       *
//*  ??????1200012906                                *
//*  ???2012?12?10?                                  *
//*  ?????????                                    *
//**********************************************************

//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int id;
	public int x1;
	public int y1;
	public int z1;
	public int x2;
	public int y2;
	public int z2;
	public double distance;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] data = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(55);
	public static AnonymousClass t = new AnonymousClass();
	public static int Main()
	{
		int n;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				data[k].id = k;
				data[k].x1 = x[i];
				data[k].y1 = y[i];
				data[k].z1 = z[i];
				data[k].x2 = x[j];
				data[k].y2 = y[j];
				data[k].z2 = z[j];
				data[k].distance = Math.pow(x[i] - x[j], 2.0) + Math.pow(y[i] - y[j], 2.0) + Math.pow(z[i] - z[j], 2.0);
				k++; //k???????????
			}
		}
		for (i = 0; i < k - 1; i++)
		{

			for (j = 0; j < k - i - 1; j++)
			{
				if (data[j].distance < data[j + 1].distance)
				{ //??????
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = data[j];
					t.copyFrom(data[j]);
					data[j] = data[j + 1];
					data[j + 1] = t;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(data[i].x1);
			System.out.print(",");
			System.out.print(data[i].y1);
			System.out.print(",");
			System.out.print(data[i].z1);
			System.out.print(")-(");
			System.out.print(data[i].x2);
			System.out.print(",");
			System.out.print(data[i].y2);
			System.out.print(",");
			System.out.print(data[i].z2);
			System.out.print(")=");
			System.out.printf("%.2f", Math.sqrt(data[i].distance));
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

