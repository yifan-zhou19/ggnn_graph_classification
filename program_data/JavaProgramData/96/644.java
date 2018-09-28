package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static int i;
	public static int len;
	public static int sum;
	public static int p;
	public static int flag;
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		sum = 0;
		flag = 1;
		for (i = 0; i < len ; ++i)
		{
			sum = (sum * 10 + s.charAt(i) - '0');
			p = sum / 13;
			sum = sum % 13;
			if (p == 0 && flag != 0)
			{
				continue;
			}
			flag = 0;
			System.out.printf("%d",p);
		}
		if (flag != 0)
		{
			System.out.printf("%d",0);
		}
		System.out.print("\n");
		System.out.printf("%d\n",sum);
	}
}

