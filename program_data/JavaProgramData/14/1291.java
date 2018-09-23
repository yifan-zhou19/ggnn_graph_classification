package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sum = new int[100000];
		int a;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct xues
	// {
	//	 int a,b,c;
	// }
	// s[100000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s[i].a = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 s[i].b = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 s[i].c = tempVar4;
		 }
		 sum[i] = s[i].b + s[i].c;
	 }
	 int fir = 0;
	 int sec = 0;
	 int thi = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (fir < sum[i])
		 {
			thi = sec;
			sec = fir;
			fir = sum[i];
			c = b;
			b = a;
			a = s[i].a;
		 }
		 else if (sec < sum[i])
		 {
		 thi = sec;
		 sec = sum[i];
		 fir = fir;
		 a = a;
		 c = b;
		 b = s[i].a;
		 }
		 else if (thi < sum[i])
		 {
		 fir = fir;
		 sec = sec;
		 thi = sum[i];
		 a = a;
		 b = b;
		 c = s[i].a;
		 }
	 }
	 System.out.printf("%d %d\n%d %d\n%d %d",a,fir,b,sec,c,thi);
		return 0;
	}


}

