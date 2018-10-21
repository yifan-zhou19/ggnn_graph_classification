import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ???1000012789_7                                            *
	// ???wusy                                                    *
	// ???11,10                                                   *
	// ???????                                                *
	//****************************************************************
	public static String x0 = new String(new char[100000]);
	public static String y0 = new String(new char[100000]);
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];
	public static int Main()
	{
		int i;
		int j;
		int[] time = new int[1000];
		int people = 0;
		int most = 0;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time, 0, (Integer.SIZE / Byte.SIZE));

		x0 = new Scanner(System.in).nextLine();
		y0 = new Scanner(System.in).nextLine();

		for (i = 0; x0.charAt(i) != '\0'; i++)
		{
			if (x0.charAt(i) == ',')
			{
				people++;
			}
		}
		people++;

		j = 0;
		for (i = 0; x0.charAt(i) != '\0'; i++)
		{
			if (x0.charAt(i) != ',')
			{
				x[j] = x[j] * 10 + x0.charAt(i) - '0';
			}
			if (x0.charAt(i) == ',')
			{
				j++;
			}
		}

		j = 0;
		for (i = 0; y0.charAt(i) != '\0'; i++)
		{
			if (y0.charAt(i) != ',')
			{
				y[j] = y[j] * 10 + y0.charAt(i) - '0';
			}
			if (y0.charAt(i) == ',')
			{
				y[j]--;
				j++;
			}
		}

		for (i = 0; i <= people - 1; i++)
		{
			for (j = x[i]; j <= y[i]; j++)
			{
				time[j]++;
			}
		}

		for (i = 0; i <= 999; i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}

		System.out.print(people);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}
