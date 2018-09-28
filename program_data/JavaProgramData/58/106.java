package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int sum;
		int h;
		String c = new String(new char[100]);
		String a = new String(new char[0]);

		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		for (i = 1;i <= n;i++)
		{
			 for (h = 0;h < 100;h++)
			 {
			 c = c.substring(0, h);
			 }

			 sum = 0;
		 c = new Scanner(System.in).nextLine();
			k = c.length();

	   if (c.charAt(0) != '_' && (c.charAt(0) < 65 || c.charAt(0)>122 || (c.charAt(0) > 90 && c.charAt(0) < 97)))
	   {
								System.out.print("0\n");
	   }

						else
						{
							for (j = 1;j < k;j++)
							{
										   if ((c.charAt(j) > 47 && c.charAt(j) < 58) || (c.charAt(j)>64 && c.charAt(j) < 91) || (c.charAt(j)>96 && c.charAt(j) < 123) || c.charAt(j) == '_')
										   {
										   sum = sum + 1;
										   }
										   else
										   {
										   break;
										   }
							}
											if (sum == k - 1)
											{
											System.out.print("1\n");
											}
											else
											{
											System.out.print("0\n");
											}
						}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}
