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
	public static AnonymousClass[] date = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(55);
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
				date[k].id = k;
				date[k].x1 = x[i];
				date[k].y1 = y[i];
				date[k].z1 = z[i];
				date[k].x2 = x[j];
				date[k].y2 = y[j];
				date[k].z2 = z[j];
				date[k].distance = Math.pow(x[i] - x[j], 2.0) + Math.pow(y[i] - y[j], 2.0) + Math.pow(z[i] - z[j], 2.0);
				k++; //k???????????
			}
		}
		for (i = k - 2; i >= 0; i--)
		{
			for (j = k - 1; j >= i + 1; j--)
			{
				if (date[i].distance < date[j].distance || date[i].distance == date[j].distance && date[j].id < date[i].id)
				{ //???????????????
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = date[i];
					t.copyFrom(date[i]);
					date[i] = date[j];
					date[j] = t;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(date[i].x1);
			System.out.print(",");
			System.out.print(date[i].y1);
			System.out.print(",");
			System.out.print(date[i].z1);
			System.out.print(")-(");
			System.out.print(date[i].x2);
			System.out.print(",");
			System.out.print(date[i].y2);
			System.out.print(",");
			System.out.print(date[i].z2);
			System.out.print(")=");
			System.out.printf("%.2f", Math.sqrt(date[i].distance));
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

