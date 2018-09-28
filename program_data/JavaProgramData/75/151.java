import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		double[] aa = new double[10000];
		double[] bb = new double[10000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(aa,0,(Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bb,0,(Double.SIZE / Byte.SIZE));
		int sum1 = 1;
		int sum2 = 1;
		int i;
		int j;
		double min = 0;
		double max = 0;
		aa[1] = Double.parseDouble(a);
		bb[1] = Double.parseDouble(b);
		for (i = 1;;i++)
		{
			if (a.charAt(i) != ',' && a.charAt(i) != 0 && a.charAt(i - 1) == ',')
			{
				sum1++;
				aa[sum1] = Double.parseDouble(a.charAt(i));
				if (aa[sum1] > max)
				{
					max = aa[sum1];
				}
				if (aa[sum1] < min)
				{
					min = aa[sum1];
				}
			}
			if (a.charAt(i) == 0)
			{
				break;
			}
		}

		for (i = 1;;i++)
		{
			if (b.charAt(i) != ',' && b.charAt(i) != 0 && b.charAt(i - 1) == ',')
			{
				sum2++;
				bb[sum2] = Double.parseDouble(b.charAt(i));
				if (bb[sum2] > max)
				{
					max = bb[sum2];
				}
				if (bb[sum2] < min)
				{
					min = bb[sum2];
				}
			}
			if (b.charAt(i) == 0)
			{
				break;
			}
		}

		System.out.print(sum1);
		System.out.print(" ");
		int[] people = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(people,0,(Integer.SIZE / Byte.SIZE));
		min = (int) min;
		max = (int) max;

		for (i = min;i <= max;i++)
		{
			for (j = 1;j <= sum1;j++)
			{
				if (i >= aa[j] != 0 && i < bb[j])
				{
					people[i]++;
				}

			}
		}
		int Max = 0;
		for (i = min;i <= max;i++)
		{
			if (people[i] > Max)
			{
				Max = people[i];
			}


		}
		System.out.print(Max);






		return 0;
	}

}
