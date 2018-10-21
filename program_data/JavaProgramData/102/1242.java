package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int t;
		float[] m = new float[41];
		float[] f = new float[41];
		float[] h = new float[41];
		char[][] str = new char[41][7];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(str[i],"male") == 0)
			{
				m[i] = h[i];
				//cout<<" "<<fixed<<setprecision(2)<<m[i];            
			}
			else
			{
				f[i] = h[i];
			}

		}
		sort(m + 1,m + n + 1);
		sort(f + 1,f + n + 1);
		for (i = 1; i <= n; i++)
		{
			if (m[i] != 0F)
			{
				t = i;
				System.out.printf("%.2f", m[i]);
				for (j = t + 1;j <= n;j++)
				{

					System.out.printf("%.2f", " ");
					System.out.printf("%.2f", m[j]);

				}
				break;
			}

		}
		for (i = n; i >= 1; i--)
		{
			if (f[i] == 0F)
			{
				break;
			}
			else
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", f[i]);
			}

		}
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

