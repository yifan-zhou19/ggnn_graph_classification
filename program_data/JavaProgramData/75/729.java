package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int i;
	public static int j;
	public static int tot = 0;
	public static int cnt;
	public static int Max = 0;
	public static char c;
	public static int[] X = new int[2000];
	public static int[] Y = new int[2000];
	public static int Main()
	{
			cnt = 0;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
			while (scanf("%d",X[cnt++]) && (c = System.in.read()) && c != '\n')
			{
				;
			}
			cnt = 0;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
			while (scanf("%d",Y[cnt++]) && (c = System.in.read()) && c != '\n')
			{
				;
			}
			for (i = 0;i < 1000;++i)
			{
				tot = 0;
				for (j = 0;j < cnt;++j)
				{
				if (X[j] <= i != 0 && Y[j]> i)
				{
					tot++;
				}
				}
				if (tot > Max)
				{
					Max = tot;
				}
			}
			System.out.printf("%d %d\n",cnt,Max);

	}

}
