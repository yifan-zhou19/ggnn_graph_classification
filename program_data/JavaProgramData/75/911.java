import java.util.*;

public class time
{
	public int in;
	public int out;
}

package <missing>;

public class GlobalMembers
{
	public static int[] in = new int[20000];
	public static int[] out = new int[20000];
	public static String line1 = new String(new char[20000]);
	public static String line2 = new String(new char[20000]);
	public static int t = 1;
	public static int s = 1;
	public static time[] person = tangible.Arrays.initializeWithDefaulttimeInstances(10000);

	public static int convert()
	{

		person[0].in = Double.parseDouble(line1);
		for (int i = 0; i < line1.length();i++)
		{

			if (line1.charAt(i - 1) != ',')
			{
				continue;
			}
			else
			{
				person[t].in = Double.parseDouble(line1.charAt(i));
				t++;
			}
		}

		person[0].out = Double.parseDouble(line2);
		for (int i = 0; i < line2.length();i++)
		{

			if (line2.charAt(i - 1) != ',')
			{
				continue;
			}
			else
			{
				person[s].out = Double.parseDouble(line2.charAt(i));
				s++;
			}
		}

	return 0;
	}

	public static int Main()
	{

		int max = 0;

		line1 = new Scanner(System.in).nextLine();
		line2 = new Scanner(System.in).nextLine();
		convert();

		for (int i = 0; i < 1000; i++)
		{
			int counter = 0;
			for (int j = 0; j < t; j++)
			{
				if (person[j].in <= i != 0 && person[j].out> i)
				{
					counter++;
					if (counter > max)
					{
						max = counter;
					}
				}


			}


		}

		System.out.print(t);
		System.out.print(" ");
		System.out.print(max);
	return 0;
	}

}

