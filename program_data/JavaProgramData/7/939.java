package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String mc = new String(new char[1000]);
		String zc = new String(new char[1000]);
		String huan = new String(new char[1000]);
		int len1;
		int len2;
		int len3;
		int i;
		int j = 0;
		int sum = 0;
		int ci = 0;
		int loc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			huan = tempVar3.charAt(0);
		}
		len1 = mc.length();
		len2 = zc.length();
		len3 = huan.length();
		for (i = 0;i < len1;i++)
		{
			if (mc.charAt(i) == zc.charAt(0))
			{
							 sum = 0;
							 for (j = i;j < len1;j++)
							 {
										   if (mc.charAt(j) == zc.charAt(j - i))
										   {
															  sum++;
										   }
										   else
										   {
												break;
										   }
							 }
							 loc = i;
													if (sum == len2)
													{
										   for (i = 0;i < loc;i++)
										   {
															System.out.printf("%c",mc.charAt(i));
										   }
										   for (i = loc;i <= loc + len3 - 1;i++)
										   {
																  System.out.printf("%c",huan.charAt(i - loc));
										   }
										   for (i = loc + len3;i <= len1 + len3 - len2 - 1;i++)
										   {
																				 System.out.printf("%c",mc.charAt(i));
										   }
										   ci++;
										   break;

													}

			}

		}


		 if (ci == 0)
		 {
			 System.out.printf("%s",mc);
		 }
			  return 0;
	}


}

