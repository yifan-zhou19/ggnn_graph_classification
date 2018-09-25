package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int Nxiaopengyou;
	 int Mtiaohuai;
	 int[] Leijicishu;
	 int i;
	 int j;
	 int cishu;
	 int shijian;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 Nxiaopengyou = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < Nxiaopengyou;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  Mtiaohuai = Integer.parseInt(tempVar2);
	  }
	  if (Mtiaohuai == 0)
	  {
		cishu = 60;
	  }
	  else
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		Leijicishu = (int)malloc(Mtiaohuai);
		for (j = 0;j < Mtiaohuai;j++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  Leijicishu[j] = Integer.parseInt(tempVar3);
		  }
		}
		shijian = 60;
		cishu = 60;
		for (j = 0;j < Mtiaohuai;j++)
		{
		  shijian = shijian - Leijicishu[j] - 3;
		  if (j > 0)
		  {
			shijian += Leijicishu[j - 1];
		  }
		  if (shijian > 0)
		  {
			cishu -= 3;
		  }
		  else
		  {
			 if (Leijicishu[j] < cishu)
			 {
			   cishu = Leijicishu[j];
			 }
			 break;
		  }
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(Leijicishu);
	  }
	  System.out.printf("%d\n",cishu);
	 }
	 return 0;
	}

}

