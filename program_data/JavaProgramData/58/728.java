package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		String q = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			q = new Scanner(System.in).nextLine(); //??????????????????
			m = q.length();
			if ((q.charAt(0) < 'A' || (q.charAt(0)>'Z' && q.charAt(0) < 'a') || q.charAt(0)>'z') && q.charAt(0) != 95)
			{
				System.out.print("0\n");
			}
			else if (m == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				for (k = 1;k <= m - 1;k++)
				{
					 if ((q.charAt(k) >= 48 && q.charAt(k) <= 57) || (q.charAt(k) >= 65 && q.charAt(k) <= 90) || (q.charAt(k) >= 97 && q.charAt(k) <= 122) || q.charAt(k) == 95)
					 {
						 ;
					 }
					 else
					 {
						 System.out.print("0\n");
						 break;
					 }
					 if (k == m - 1)
					 {
						 System.out.print("1\n");
					 }
				}
			}
		}
		return 0;
	}

}

