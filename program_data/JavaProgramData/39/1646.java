package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[100][21];
		int n; //??
		int temp = 0; //??????????
		int temp_money = 0; //?????????????
		int temp_name; //??????????????
		int all_money = 0; //??????????????
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//	printf("n             =         %d\n",n);
		for (i = 0;i < n;i++)
		{
			int qi_mo;
			int ping_yi;
			char gan_bu;
			char xi_bu;
			int lun_wen;
	//		printf("%d\n", i);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
	//		printf("%s\n",name[i]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qi_mo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ping_yi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gan_bu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi_bu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				lun_wen = Integer.parseInt(tempVar7);
			}
			if ((qi_mo > 80) && (lun_wen >= 1))
			{
				temp += 8000;
			}
			if ((qi_mo > 85) && (ping_yi > 80))
			{
				temp += 4000;
			}
			if (qi_mo > 90)
			{
				temp += 2000;
			}
			if ((qi_mo > 85) && (xi_bu == 'Y'))
			{
				temp += 1000;
			}
			if ((ping_yi > 80) && (gan_bu == 'Y'))
			{
				temp += 850;
			}
			if (temp > temp_money)
			{
				temp_money = temp;
				temp_name = i;
			}
			all_money += temp;
			temp = 0;
		}
		System.out.printf("%s\n",name[temp_name]);
		System.out.printf("%d\n",temp_money);
		System.out.printf("%d\n",all_money);
	}
}

