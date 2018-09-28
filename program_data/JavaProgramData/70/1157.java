package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float[] a = new float[200];
		float[] b = new float[200];
		float maxx = -1F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				//cout<<sqrt((a[i]-a[j])*(a[i]-a[j])+(b[i]-b[j])*(b[i]-b[j]))<<endl;
				if (Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j])) >= maxx)
				{
					maxx = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
				}
			}
		}
		System.out.print(maxx);
		System.out.print("\n");
		return 0;
	}
}

