package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		int i;
		int n;
		int s;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (i <= n)
		{
			if (i >= 70 && i < 80 || i % 7 == 0 || i % 10 == 7)
			{
			a[i] = 0;
			}
		else
		{
			a[i] = i;
		} //??7??????
		i++;
		}
		i = 1;
		s = 0;
		while (i <= n)
		{
			s = s + a[i] * a[i];
		i++;
		} //????
		System.out.print(s);


		return 0;
	}

}

