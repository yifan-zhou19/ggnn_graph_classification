package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int l;
		int i;

	l = 1;
	 while (scanf("%1d", a[l]) == 1)
	 {
		 l++;
	 }
	 l--;
	 for (i = l;i >= 1;i--)
	 {
		 System.out.printf("%d",a[i]);
	 }
	}

}
