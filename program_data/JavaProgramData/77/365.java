package <missing>;

public class GlobalMembers
{
	public static final String queue = "";
	public static char boy;
	public static char girl;
	public static int number;
	public static int pairs = 0;
	public static void findpair(int girlid)
	{
		int i;
		if ((number / 2 - pairs) != 1)
		{
			pairs++;
			i = girlid - 1;
			while (i > 0)
			{
				if (queue.charAt(i) == girl)
				{
			break;
				}
			i--;
			}
			findpair(i);
		}
		for (i = girlid - 1;i >= 0;i--)
		{
			if (queue.charAt(i) == boy)
			{
				System.out.printf("%d %d\n",i,girlid);
				queue = queue.substring(0, i);
				break;
			}
		}
	}
	public static int Main()
	{
		int i;
		queue = new Scanner(System.in).nextLine();
		number = queue.length();
		boy = queue.charAt(0);
		for (i = 0;i < number;i++)
		{
			if (queue.charAt(i) != boy)
			{
				girl = queue.charAt(i);
				break;
			}
		}
			findpair(number - 1);
			return 0;
	}





}
