package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[200]);
	  int[] a = new int[200];
	  int[] b = new int[200];
	  int yushu;
	  c = new Scanner(System.in).nextLine();
	  int m;
	  int i;
	  m = c.length();
	  for (i = 0;i < m;i++)
	  {
		a[i] = c.charAt(i) - '0';
	  }
	  if (m > 2)
	  {
			if ((a[0] * 10 + a[1]) >= 13)
			{
			yushu = a[0];
			for (i = 1;i < m;i++)
			{
				b[i] = (yushu * 10 + a[i]) / 13;
				yushu = (yushu * 10 + a[i]) % 13;
			}
		for (i = 1;i < m;i++)
		{
			System.out.printf("%d",b[i]);
		}
		System.out.print("\n");
		System.out.printf("%d",yushu);
			}
	 else
	 {
			yushu = a[0] * 10 + a[1];
			for (i = 2;i < m;i++)
			{
				b[i] = (yushu * 10 + a[i]) / 13;
				yushu = (yushu * 10 + a[i]) % 13;
			}
		for (i = 2;i < m;i++)
		{
			System.out.printf("%d",b[i]);
		}
		System.out.print("\n");
		System.out.printf("%d",yushu);
	 }
	  }
	if (m == 2)
	{
		System.out.printf("%d\n",(a[0] * 10 + a[1]) / 13);
		System.out.printf("%d",(a[0] * 10 + a[1]) % 13);
	}
	if (m == 1)
	{
		System.out.print("0\n");
		System.out.printf("%d",a[0]);
	}
	}
}
