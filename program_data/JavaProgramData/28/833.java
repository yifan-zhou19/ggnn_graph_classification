package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[1000]);
	int[] a = new int[300];
	int[] b = new int[300];
	str = new Scanner(System.in).nextLine();
	int len;
	len = str.length();
	int i;
	int k = 1;
	int j = 0;
	a[0] = -1;
	for (i = 0;i < len;i++)
	{
		if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
		{
			a[k] = i;
			k++;
		}
		if (str.charAt(i) != ' ' && (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == '\0'))
		{
			b[j] = i;
			j++;
		}
	}
	System.out.printf("%d",b[0] - a[0]);
	for (i = 1;i < k;i++)
	{
		System.out.printf(",%d",b[i] - a[i]);
	}
	return 0;
	}
}
