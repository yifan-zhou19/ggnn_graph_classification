package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int countm = 0;
		int countf = 0;
		float[] m = new float[40];
		float[] f = new float[40];
		float t;
		String temp = new String(new char[10]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < num;i++)
		{
			temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
			t = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (temp.charAt(0) == 'm')
			{
				m[countm] = t;
				countm++;
			}
			else
			{
				f[countf] = t;
				countf++;
			}
		}
		sort(m,m + countm);
		sort(f,f + countf);

		for (int i = 0;i < countm;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (int i = countf - 1;i >= 0;i--)
		{
			System.out.printf("%.2f",f[i]);
			if (i != 0)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

