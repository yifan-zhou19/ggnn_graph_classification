package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String shurudeshu = new String(new char[1000]);
		int n;
		int shijingzhi = 0;
		int i;
		int jingzhi;
		int daizhuanhuandejingzhi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			jingzhi = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shurudeshu = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			daizhuanhuandejingzhi = Integer.parseInt(tempVar3);
		}
		n = shurudeshu.length();
		for (i = 0;i <= n - 1;i++)
		{
			if (('A' <= shurudeshu.charAt(i)) && (shurudeshu.charAt(i) <= 'Z'))
			{
				shurudeshu = tangible.StringFunctions.changeCharacter(shurudeshu, i, shurudeshu.charAt(i) - 'A' + 10);
			}
			else if (('a' <= shurudeshu.charAt(i)) && (shurudeshu.charAt(i) <= 'z'))
			{
				shurudeshu = tangible.StringFunctions.changeCharacter(shurudeshu, i, shurudeshu.charAt(i) - 'a' + 10);
			}
			else if (('0' <= shurudeshu.charAt(i)) && (shurudeshu.charAt(i) <= '9'))
			{
				shurudeshu = tangible.StringFunctions.changeCharacter(shurudeshu, i, shurudeshu.charAt(i) - '0');
			}
		}
			for (i = 0;i <= n - 1;i++)
			{
				shijingzhi = shijingzhi + (int)(shurudeshu.charAt(i) * Math.pow(jingzhi,n - i - 1));
			}
			if (shijingzhi == 0)
			{
				System.out.printf("%d",shijingzhi);
			}
			if (shijingzhi != 0)
			{
			int shang;
			int[] yushu = new int[100];
			int j;
	   shang = shijingzhi;
	   for (i = 0;shang != 0;i++)
	   {
		   yushu[i] = shang % daizhuanhuandejingzhi;
		   shang = shang / daizhuanhuandejingzhi;
	   }
	   for (j = i - 1;j >= 0;j--)
	   {
		   if ((0 <= yushu[j]) && (yushu[j] <= 9))
		   {
			   System.out.printf("%d",yushu[j]);
		   }
		   else if (yushu[j] >= 10)
		   {
			   yushu[j] = yushu[j] + 'A' - 10;
			   System.out.printf("%c",yushu[j]);
		   }
	   }
			}
	   System.out.print("\n");
	}
}

