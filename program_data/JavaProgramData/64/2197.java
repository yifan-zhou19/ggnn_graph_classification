package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		int n;
		int m = 0;
		int a = 0;
		float l = 0F;
		float[] D = new float[50];
		int[] X = new int[11];
		int[] Y = new int[11];
		int[] Z = new int[11];
		int[] p = new int[50];
		int[] q = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			X[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				D[m] = Math.sqrt((X[i] - X[j]) * (X[i] - X[j]) + (Y[i] - Y[j]) * (Y[i] - Y[j]) + (Z[i] - Z[j]) * (Z[i] - Z[j])); //???????????????D?
				p[m] = i;
				q[m] = j; //???????????????????
				m++;
			}
		}
		for (int i = m - 1;i > 0;i--)
		{
			for (int j = 0;j < i;j++)
			{
				if (D[j] < D[j + 1])
				{
					l = D[j];
					D[j] = D[j + 1];
					D[j + 1] = l;

					a = p[j];
					p[j] = p[j + 1];
					p[j + 1] = a;

					a = q[j];
					q[j] = q[j + 1];
					q[j + 1] = a;
				} //?????????,???????????????????

			}
		}
		for (int k = 0;k < m;k++) //????????????
		{

	  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",X[p[k]],Y[p[k]],Z[p[k]],X[q[k]],Y[q[k]],Z[q[k]],D[k]);
		}

		return 0;
	}
}

