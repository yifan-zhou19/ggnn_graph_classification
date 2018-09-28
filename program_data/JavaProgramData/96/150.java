package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shuru = new String(new char[1000]);
		String shuchu = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shuru = tempVar.charAt(0);
		}
		int i;
		int length;
		int yushu;
		int[][] a = new int[1000][2];
		int[] shang = new int[1000];
		length = shuru.length();

		for (i = 0;i < length;i++)
		{
			a[i][0] = shuru.charAt(i) - '0';
		}
		yushu = 0;
		int yushu2;
		for (i = 0;i < length;i++)
		{
		   yushu = yushu * 10 + a[i][0];
		   if (yushu >= 13)
		   {
			  yushu2 = yushu;
			  yushu = yushu % 13;
			  shang[i] = yushu2 / 13;
		   }
		   else
		   {
			  shang[i] = 0;
			  yushu = yushu;
		   }
		}

		if (shang[0] == 0 && shang[1] != 0)
		{
		   for (i = 1;i < length;i++)
		   {
			 shuchu = tangible.StringFunctions.changeCharacter(shuchu, i - 1, shang[i] + '0');
		   }
		   shuchu = tangible.StringFunctions.changeCharacter(shuchu, length - 1, '\0');
		}
		else if (shang[0] == 0 && shang[1] == 0)
		{
		   for (i = 2;i < length;i++)
		   {
			 shuchu = tangible.StringFunctions.changeCharacter(shuchu, i - 2, shang[i] + '0');
		   }
		   shuchu = tangible.StringFunctions.changeCharacter(shuchu, length - 2, '\0');
		}
		else
		{
		   for (i = 0;i < length;i++)
		   {
			 shuchu = tangible.StringFunctions.changeCharacter(shuchu, i, shang[i] + '0');
		   }
		}
		shuchu = tangible.StringFunctions.changeCharacter(shuchu, i - 1, '\0');
		int t;
		t = a[0][0] * 10 + a[1][0];
		if (length == 1 && a[0][0] == 0)
		{
		String c = new String(new char[2]);
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');

		System.out.printf("%s\n",c);
		System.out.print("0");
		}
		else if (length == 1)
		{
		String c = new String(new char[2]);
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');

		System.out.printf("%s\n",c);
		System.out.printf("%d",yushu);
		}
		else if (t < 13 && length == 2)
		{
		String c = new String(new char[2]);
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');

		System.out.printf("%s\n",c);
		System.out.printf("%d",yushu);
		}
		else
		{
		System.out.printf("%s\n",shuchu);
		System.out.printf("%d",yushu);
		}
		System.in.read();
		System.in.read();
	}

}

