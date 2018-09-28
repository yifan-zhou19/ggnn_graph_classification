package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		char[][] a = new char[300][50];
		int[] b = new int[300];
		int i = 1;
		int n;
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = tempVar.charAt(0);
		}
		System.out.printf("%d",String.valueOf(a[0]).length());

		while (scanf("%s",a[i]) != EOF)
		{
			b[i] = String.valueOf(a[i]).length();
			System.out.printf(",%d",b[i]);
			i++;
		}

	}
}

