package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		float av = 0F;
		float[] b = new float[n];
		float max = 0F;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			av = av + a[i];
		}
		av = av / n;
		for (i = 0;i < n;i++)
		{
		  if (av > a[i])
		  {
			  b[i] = av - a[i];
		  }
		  else
		  {
			  b[i] = a[i] - av;
		  }
		  if (max < b[i])
		  {
			  max = b[i];
		  }
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				count++;
			}
		}
		for (i = 0;i < n;i++)
		{
		if (b[i] == max)
		{
			if (count == 1)
			{
				System.out.print(a[i]);
				break;
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(",");
				count--;
			}
		}
		}
		return 0;
	}
}

