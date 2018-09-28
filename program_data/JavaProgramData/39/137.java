public class stu
{
	public String xingming = new String(new char[21]);
	public int qimchengji;
	public int pingychengji;
	public String ganbu = new String(new char[2]);
	public String xibu = new String(new char[2]);
	public int lunwenshu;
	public int jiangxuejin;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stum = tangible.Arrays.initializeWithDefaultstuInstances(101);
	public static void Main()
	{
		final String s = "Y";
		int n;
		int i;
		int j;
		int jiangjinzongshu;
		  jiangjinzongshu = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  stum[i].jiangxuejin = 0;
		  }
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stum[i].xingming = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stum[i].qimchengji = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stum[i].pingychengji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				stum[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				stum[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stum[i].lunwenshu = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stum[i].qimchengji > 80 && stum[i].lunwenshu >= 1)
			{
				stum[i].jiangxuejin += 8000;
			}
			if (stum[i].qimchengji > 85 && stum[i].pingychengji > 80)
			{
				stum[i].jiangxuejin += 4000;
			}
			if (stum[i].qimchengji > 90)
			{
				stum[i].jiangxuejin += 2000;
			}
			if (stum[i].qimchengji > 85 && strcmp(stum[i].xibu,s) == 0)
			{
				stum[i].jiangxuejin += 1000;
			}
			if (stum[i].pingychengji > 80 && strcmp(stum[i].ganbu,s) == 0)
			{
				stum[i].jiangxuejin += 850;
			}
		}
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j <= 100 - i - 1;j++)
			{
				if (stum[j].jiangxuejin < stum[j + 1].jiangxuejin)
				{
					stum[100] = stum[j];
					stum[j] = stum[j + 1];
					stum[j + 1] = stum[100];
				}
			}
		}
		System.out.printf("%s\n",stum[0].xingming);
		System.out.printf("%d\n",stum[0].jiangxuejin);
		for (i = 0;i < n;i++)
		{
			jiangjinzongshu += stum[i].jiangxuejin;
		}
		System.out.printf("%d\n",jiangjinzongshu);
	}


}

