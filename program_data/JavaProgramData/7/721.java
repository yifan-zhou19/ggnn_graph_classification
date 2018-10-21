package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[2000]);
		zfc = new Scanner(System.in).nextLine();
		int c;
		c = zfc.length();
		String tzfc = new String(new char[2000]);
		String hzfc = new String(new char[2000]);
		tzfc = new Scanner(System.in).nextLine();
		hzfc = new Scanner(System.in).nextLine();
		int ct;
		int ch;
		ct = tzfc.length();
		ch = hzfc.length();


		int i;
		int wei;
		int an = 0;
		int x;
		int deng = 0;
		for (i = 0;i < c;i++)
		{
			 int flag = 0;
			 for (x = i;x < ct + i;x++)
			 {
				if (zfc.charAt(x) != tzfc.charAt(x - i))
				{
				flag = 1;
				}
				if (flag == 1)
				{
				break;
				}
			 }
			 if (flag == 0)
			 {
			 wei = i;
			 an++;
			 deng = 1;
			 }


		  if (an == 1)
		  {
		  break;
		  }
		}

		if (deng == 0)
		{
		System.out.println(zfc);
		}
		else
		{

		int[] xzfc = new int[2000];
		for (i = 0;i < wei;i++)
		{
		xzfc[i] = zfc.charAt(i);
		}
		for (i = wei;i < ch + wei;i++)
		{
		xzfc[i] = hzfc.charAt(i - wei);
		}
		for (i = ch + wei;i < c - ct + ch;i++)
		{
		xzfc[i] = zfc.charAt(i - (ch - ct));
		}


		for (i = 0;i < c - ct + ch;i++)
		{
		System.out.printf("%c",xzfc[i]);
		}

		}
		return 0;
	}

}
