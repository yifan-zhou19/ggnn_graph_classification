package <missing>;

public class GlobalMembers
{
	public static int dingwei(String duan, String chang)
	{
		int i;
		int geshu1 = 0;
		int geshu2 = 0;
		for (i = 0; !duan[i].equals('\0');i++)
		{
			geshu1 += 1;
		}
		for (i = 0; !chang[i].equals('\0');i++)
		{
			geshu2 += 1;
		}
		int j;
		int cishu = 0;
		int weizhi = 0;
		for (i = 0;i <= (geshu2 - geshu1);i++)
		{
			for (j = 0;j < geshu1;j++)
			{
				if (duan[j].equals(chang[i]))
				{
					cishu++;
					i++;
				}
				else
				{
					break;
				}
			}
			if (cishu == geshu1)
			{
				weizhi = i - geshu1;
				break;
			}
			else
			{
				cishu = 0;
				continue;
			}
		}
		if (cishu == 0)
		{
			return -1;
		}
		else
		{
			return weizhi;
		}
	}
	public static int Main()
	{
		String zfc = new String(new char[300]);
		String beiti = new String(new char[256]);
		String ti = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			beiti = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ti = tempVar3.charAt(0);
		}
		int lenzfc;
		int lenbt;
		int lent;
		int weizhi;
		int i;
		lenzfc = zfc.length();
		lenbt = beiti.length();
		lent = ti.length();
		weizhi = dingwei(beiti, zfc);
		if (weizhi < 0)
		{
			System.out.printf("%s\n",zfc);
		}
		else
		{
			if (lenbt == lent)
			{
				for (i = 0;i < lenbt;i++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, weizhi + i, ti.charAt(i));
				}

			}
			else if (lenbt > lent)
			{
				for (i = 0;i < lent;i++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, weizhi + i, ti.charAt(i));
				}
				for (i = 0;i < (lenzfc - lenbt - weizhi);i++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, weizhi + lent + i, zfc.charAt(weizhi + lenbt + i));
				}
				zfc = tangible.StringFunctions.changeCharacter(zfc, lenzfc - lenbt + lent, '\0');
			}
			else if (lenbt < lent)
			{
				for (i = lenzfc - 1;i >= weizhi + lenbt;i--)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, i + lent - lenbt, zfc.charAt(i));
				}
				for (i = 0;i < lent;i++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, weizhi + i, ti.charAt(i));
				}
				zfc = tangible.StringFunctions.changeCharacter(zfc, lenzfc + lent - lenbt, '\0');
			}
			System.out.printf("%s\n",zfc);
		}
		return 0;
	}

}

