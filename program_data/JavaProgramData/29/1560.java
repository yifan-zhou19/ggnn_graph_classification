package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[100]; //????a?b??????
		float[] b = new float[100];
		float c = 0F;
		int m; //m?????n????????
		int[] n = new int[100];
		int i;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m;k++)
		{
			n[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //?????
		for (k = 0;k < m;k++) //????
		{

		for (i = 1;i < n[k] + 1;i++) //?????????
		{
			a[0] = 2F;
			b[0] = 1F;
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}
		for (i = 0;i < n[k];i++)
		{
		c = c + a[i] / b[i]; //???
		}
		System.out.printf("%.3f",c);
		System.out.print("\n");
		c = 0F;
		}
		System.in.read();
		System.in.read();
		return 0;
	}



}

