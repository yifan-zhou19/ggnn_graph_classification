package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		//?????????
		int l;
		int k;
		int i;
		l = s.length();
		int[] sz = new int[100];

		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				sz[i] = 10 + s.charAt(i) - 'a';
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				sz[i] = 10 + s.charAt(i) - 'A';
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				sz[i] = 0 + s.charAt(i) - '0';
			}
		}

		for (i = 0;i < l;i++)
		{
			//printf("sz[%d]=%d",i,sz[i]);
			k = l - i - 1;
			while (k-- != 0)
			{
				sz[i] = sz[i] * a;
			}
			//printf("sz[%d]=%d",i,sz[i]);
		}

		int num10 = 0; //shijinzhishu
		for (i = 0;i < l;i++)
		{
			num10 += sz[i];

		}
		//printf("%d",num10);

		//zhuanhuawei b jinzhi
		int shang;
		int yushu;
		shang = num10 / b;
		yushu = num10 % b;
		int[] geweiyushu = new int[100];
		if (shang == 0)
		{
			System.out.printf("%d",yushu);
		}
		else
		{
			for (i = 0;shang != 0;i++)
			{
			geweiyushu[i] = yushu;

			yushu = shang % b;
			shang = shang / b;
			}
		geweiyushu[i] = yushu;
		}

		int weishu;
		weishu = i + 1;
		//printf("weishu=%d",weishu);




		//???string

		String s2 = new String(new char[100]);

		for (i = 0;i < weishu;i++)
		{
			if (geweiyushu[i] >= 10)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, geweiyushu[i] - 10 + 'A');
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, geweiyushu[i] - 0 + '0');
			}
		}
		int y = 0;
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) != '0')
			{
				y++;
			}
		}
		//printf("y=%d\n",y);
		if (y != 0)
		{
		for (i = weishu - 1;i >= 0;i--)
		{
			System.out.printf("%c",s2.charAt(i));
		}
		}
		//else printf("0");


		return 0;
	}

}

