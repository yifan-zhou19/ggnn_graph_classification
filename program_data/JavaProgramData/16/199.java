package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			a[i] = System.in.read();
		if (a[i] < 48 || a[i]>57)
		{
				j = i;
				break;
		}
		}
		for (i = j;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
	}
}
