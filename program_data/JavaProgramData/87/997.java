package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int b;
	public static int c;
	public static int d;
	public static int e;
	public static int f;
	public static int i;
	public static int sum;
	public static int Main()
	{
		while (scanf("%d %d %d %d %d %d\n",a,b,c,d,e,f))
		{
			if (a == 0)
			{
				break;
			}
		else
		{
			sum = 0;
		sum += d * 3600;
		sum += e * 60;
		sum += f;
		sum += (12 - a - 1) * 3600;
		sum += (60 - b - 1) * 60;
		sum += 60 - c;
		System.out.printf("%d\n",sum);
		}
		}
		return 0;
	}
}
