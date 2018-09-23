package <missing>;

public class GlobalMembers
{
	public static char[][] sex = new char[45][7];
	public static float[] height = new float[45];
	public static int[] seq = new int[45];

	public static int compare(Object a, Object b)
	{
		int i = (int)a;
		int j = (int)b;
		if (strcmp(sex[i],"male") == 0 && strcmp(sex[j],"female") == 0)
		{
			return 0;
		}
		if (strcmp(sex[i],"female") == 0 && strcmp(sex[j],"male") == 0)
		{
			return 1;
		}
		// else same sex
		if (strcmp(sex[i],"male") == 0 && strcmp(sex[j],"male") == 0)
		{
			return height[i] > height[j];
		}
		if (strcmp(sex[i],"female") == 0 && strcmp(sex[j],"female") == 0)
		{
			return height[i] < height[j];
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			seq[i] = i;
		}
		qsort(seq,n,(Integer.SIZE / Byte.SIZE),compare);
		int startFlag = true;
		for (int i = 0;i < n;i++)
		{
			if (startFlag != 0)
			{
				System.out.printf("%.2f",height[seq[i]]);
				startFlag = false;
			}
			else
			{
				System.out.printf(" %.2f",height[seq[i]]);
			}
		}
		System.out.print("\n");

	}
}

