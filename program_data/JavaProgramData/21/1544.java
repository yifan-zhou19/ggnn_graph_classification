package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[320];
		double sum = 0;
		int num = 0;
		int i;
		int j;
		double average = 0;
		double[] b = new double[320];
		double t;
		double[] c = new double[400];
		double max = 0;
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		//cout<<sum;
		average = sum / n;
		//cout<<average;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - average);
			//cout<<"b"<<i<<b[i]<<" ";
			if (max < b[i])
			{
				max = b[i];
			}
		}
		//cout<<"max "<<max;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[num] = a[i];
				num++;
			}
		}
		//cout<<"check "<<c[0]<<" "<<c[1]<<endl;
		for (i = 0;i < num - 1;i++)
		{
			for (j = 0;j < num - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
		System.out.print(c[0]);
		for (i = 1;i < num;i++)
		{
			System.out.print(",");
			System.out.print(c[i]);
		}
		return 0;
	}
}

