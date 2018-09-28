package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String p;
	int n = 0;
	int[] b = new int[100];
	int[] s = new int[100];
	int e;
	int d;
	int max;
	int min;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *h;
	int h;
	int[] q;
	a = new Scanner(System.in).nextLine();
	p = a;
	h = s;
	q = b;
	q[0] = -1;
	for (i = 0;p.charAt(i) != '\0';i++)
	{
		if (p.charAt(i) == ' ')
		{
		n = n + 1;
	q[n] = i;
		}
	}
	for (i = q[n] + 1;p.charAt(i) != '\0';i++)
	{
	}
	n = n + 1;
	q[n] = i;
	for (i = 1;i <= n;i++)
	{
	h[i] = q[i] - q[i - 1] - 1;
	}
	max = h[1];
	min = h[1];
	for (i = 1;i <= n;i++)
	{
		if (max < h[i])
		{
	max = h[i];
		}
	if (min > h[i])
	{
	min = h[i];
	}
	}
	for (i = 1;i <= n;i++)
	{
		if (h[i] == max)
		{
		d = i;
		break;
		}
	}
	for (i = q[d - 1] + 1;i < q[d];i++)
	{
	System.out.printf("%c",p.charAt(i));
	}
	System.out.print("\n");
	for (i = 1;i <= n;i++)
	{
		if (h[i] == min)
		{
		e = i;
		break;
		}
	}
	for (i = q[e-1] + 1;i < q[e];i++)
	{
	System.out.printf("%c",p.charAt(i));
	}
	return 0;
	}
}
