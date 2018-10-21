package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int fir = 0;
		int sec = 0;
		int thi = 0;
		int fir_n = 0;
		int sec_n = 0;
		int thi_n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int num;
	//		int ma;
	//		int cn;
	//		int score;
	//	}
	//	s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s.ma = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s.cn = tempVar4;
			}
			s.score = s.ma + s.cn;

			if (s.score > fir)
			{
				thi = sec;
				thi_n = sec_n;
				sec = fir;
				sec_n = fir_n;
				fir = s.score;
				fir_n = s.num;
			}

		   else if (s.score > sec)
		   {
				thi = sec;
				thi_n = sec_n;
				sec = s.score;
				sec_n = s.num;
		   }
		   else if (s.score > thi)
		   {
				thi = s.score;
				thi_n = s.num;
		   }
		}

		System.out.printf("%d %d\n",fir_n,fir);
		System.out.printf("%d %d\n",sec_n,sec);
		System.out.printf("%d %d\n",thi_n,thi);


		return 0;
	}

}

