package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100000]);
	public static void Main(String[] args)
	{

		int[] a = new int[300];
		int i;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();

		int word = 0;
		int num = 0;
		int total = 0;
		for (i = 0;i < len;)
		{
			while (str.charAt(i) != ' ' && i < len)
			{
		num++;
		i++;
		word = 1;
			}
			if (word == 1)
			{
			total++;
			a[total - 1] = num;
			}
			num = 0;
			i++;
			word = 0;

		}
		for (i = 0;i < total - 1;i++)
		{
		System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d\n",a[total - 1]);
	}


}
