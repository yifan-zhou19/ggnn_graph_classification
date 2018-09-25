package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???????.cpp                     **
	//*??: ??     1100012808              **
	//*???2011.11.03                       **
	//******************************************
	public static int Main() //???
	{ //?????
		float[] h = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float[] m = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float[] f = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float t;
		char[][] sex = new char[41][10];
		int i = 0;
		int j = 1;
		int k = 1;
		int n = 0;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (sex[i][0] == 'm')
			{
				m[j] = h[i];
				j++;
			}
			else
			{
				f[k] = h[i];
				k++;
			}
		}
		for (l = 1; l < j - 1; l++)
		{
			for (i = 1; i < j - l; i++)
			{
				if (m[i] > m[i + 1])
				{
					t = m[i];
					m[i] = m[i + 1];
					m[i + 1] = t;
				}
			}
		}
		for (l = 1; l < k - 1; l++)
		{
			for (i = 1; i < k - l; i++)
			{
				if (f[i] < f[i + 1])
				{
					t = f[i];
					f[i] = f[i + 1];
					f[i + 1] = t;
				}
			}
		}
		System.out.printf("%.2f", m[1]);
		for (i = 2; i < j; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", m[i]);
		}
		for (i = 1; i < k; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", f[i]);
		}
		return 0;
	}











}

