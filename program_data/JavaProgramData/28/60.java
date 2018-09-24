package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] a = new char[500][60];
	int i;
	int j;
	int k;
	int n = 0;
	int m;
	int[] q = new int[500];
	while (scanf("%s",a[n]) != EOF)
	{
		n++;
	}
	for (i = 0;i < n;i++)
	{
	q[i] = String.valueOf(a[i]).length();
	}
	for (i = 0;i < n;i++)
	{
	i == 0?System.out.printf("%d",q[i]):printf(",%d",q[i]);
	}
	}
}
