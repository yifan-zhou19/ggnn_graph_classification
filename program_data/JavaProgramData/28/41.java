package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] a = new char[300][20];
	int i;
	int[] len = new int[300];
	int l;
	for (i = 0;scanf("%s",a[i]) != EOF;i++)
	{
	len[i] = String.valueOf(a[i]).length();
	}
	l = i;
	for (i = 0;i < l;i++)
	{
		System.out.printf("%d",len[i]);
		if (i != l - 1)
		{
		System.out.print(",");
		}
	}
	System.out.print("\n");
	}
}
