package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[16];
		int j;
		int num;
		while (true)
		{
			  num = 0;
		for (int i = 0; i < 16; i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1F)
			{
				break;
			}
			if (a[i] == 0F)
			{
			   j = i - 1;
			   break;
			}
		}
		if (a[0] == -1F)
		{
		   break;
		}
		for (int i = 0; i <= j; i++)
		{
			for (int k = 0; k <= j; k++)
			{
				if (a[i] / a[k] == 2F && i != k)
				{
				   num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		}
		return 0;
	}

}

