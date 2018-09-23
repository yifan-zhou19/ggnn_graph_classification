public class ys
{
		public char zm;
public int gs;
}

package <missing>;

public class GlobalMembers
{
		public static ys[] ys = tangible.Arrays.initializeWithDefaultysInstances(1001);

	public static void Main()
	{
		int i;
		int t;
		int len;
	final String a = "";

	a = new Scanner(System.in).nextLine();
	len = a.length();

	for (i = 0;i < 1001;i++)
	{
	ys[i].gs = 0;
	}


	ys[0].zm = a.charAt(0);
	ys[0].gs = 1;
	t = 0;
	for (i = 1;i < len;i++)
	{
		if (a.charAt(i) == ys[t].zm || a.charAt(i) == (ys[t].zm + 32) || a.charAt(i) == ys[t].zm - 32)
		{
	ys[t].gs++;
		}
	else
	{
		t++;
	ys[t].zm = a.charAt(i);
	ys[t].gs = 1;
	}
	}

	for (i = 0;i <= t;i++)
	{
		if (ys[i].zm >= 'a')
		{
	ys[i].zm = ys[i].zm - 32;
		}
		System.out.printf("(%c,%d)",ys[i].zm,ys[i].gs);
	}


	}

}

