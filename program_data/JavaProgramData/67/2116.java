public class liaoxiao
{
public int a;
public int b;
}

package <missing>;

public class GlobalMembers
{
	public static void panduan(double x,double y)
	{
	if ((x - y) > (5.0 / 100))
	{
	System.out.print("worse");
	System.out.print("\n");
	}
	else if ((y - x) > (5.0 / 100))
	{
	System.out.print("better");
	System.out.print("\n");
	}
	else
	{
	System.out.print("same");
	System.out.print("\n");
	}
	}
	public static liaoxiao h = new liaoxiao();
	public static int Main()
	{
	int n;
	int i;
	float[] c = new float[10000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	h.a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	h.b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	c[i] = h.b / (h.a * 1.0);
	}
	for (i = 1;i < n;i++)
	{
	panduan(c[0], c[i]);
	}
	return 0;
	}

}

