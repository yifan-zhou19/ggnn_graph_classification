package <missing>;

public class GlobalMembers
{
	public static float Sn(int n) //????????
	{
		float[] s = new float[n + 1]; //?????????
		s[0] = 1F; //???
		s[1] = 2F; //???
		for (int k = 0;k < n;k++)
		{
			s[k + 2] = s[k] + s[k + 1]; //????????
		}
		float p = 0F;
		for (int k = 0;k < n;k++)
		{
			p = p + s[k + 1] / s[k]; //????
		}
		return p; //?????
	}
	public static int Main() //???
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[m]; //??????
		for (int k = 0;k < m;k++)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int k = 0;k < m;k++)
		{
			System.out.printf("%.3f",Sn(a[k])); //???????
			System.out.print("\n"); //??
		}
		return 0;
	}

















}

