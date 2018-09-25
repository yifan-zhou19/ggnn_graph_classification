package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[4000]);
	public static String t = new String(new char[4000]);
	public static int[] a = new int[3000];
	public static int[] b = new int[3000];
	public static int[] h = new int[1008];
	public static void Main()
	{
		int i;
		int k;
		int n1;
		int n2;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		n1 = s.length();
		k = 0;
		for (i = 0;i < n1;i++)
		{

			if (s.charAt(i) != ',')
			{
				a[k] = a[k] * 10 + s.charAt(i) - '0';
			}
			else
			{
				k++;
			}
		}
		n2 = t.length();
		k = 0;
		for (i = 0;i < n2;i++)
		{

			if (t.charAt(i) != ',')
			{
				b[k] = b[k] * 10 + t.charAt(i) - '0';
			}
			else
			{
				k++;
			}
		}
		System.out.printf("%d ",k + 1);
		int j;
		for (i = 0;i < k + 1;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				h[j]++;
			}
		}
		int y = 0;
		for (i = 0;i < 1000;i++)
		{
			if (h[i] >= y)
			{
				y = h[i];
			}
		}
		System.out.printf("%d\n",y);
	}


}
