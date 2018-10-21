package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[16];
int[] b = new int[16];
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[16],b[16];
		int n;
		int i;
		int j;
		int s = 0;
		while (scanf("%d", Main_a[0]), Main_a[0] != -1)
		{
			for (i = 1;Main_a[i - 1] != 0;i++)
			{
				b[i - 1] = 2 * Main_a[i - 1];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				Main_a[i] = Integer.parseInt(tempVar);
			}
			}
			n = i - 2;
			s = 0;
			for (i = 0;i <= n;i++)
			{
			for (j = 0;j <= n;j++)
			{
			if (Main_a[i] == b[j])
			{
				s++;
				break;
			}
			}
			}
			System.out.printf("%d\n",s);
		}
	}
}

