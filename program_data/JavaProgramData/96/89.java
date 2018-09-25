package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int n;
		  int m;
		  int r;
		  int i;
		  int j;
		  int k;
		  String numm = new String(new char[102]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  numm = tempVar.charAt(0);
		  }
		  int LEN = numm.length();
		  int[] num = new int[102];

		  for (i = 0;i < LEN;i++)
		  {
			num[i] = numm.charAt(i) - '0'; //printf("%d  ",num[i]);
		  }
	   if (LEN > 2)
	   {
		  if (num[0] * 10 + num[1] >= 13)
		  {
			 System.out.printf("%d",(num[0] * 10 + num[1]) / 13);
			 i = 2;
			 r = (num[0] * 10 + num[1]) % 13;

		  }
		  else
		  {
			 i = 2;
			 r = (num[0] * 10 + num[1]) % 13;
		  }
		  while (i < LEN)
		  {
			 System.out.printf("%d",(10 * r + num[i]) / 13);
			 r = (10 * r + num[i]) % 13;
			 i++;
		  }
		  System.out.printf("\n%d",r);
	   }
	 if (LEN == 1)
	 {
		  System.out.printf("%d\n%d",0,num[0]);
	 }
	 if (LEN == 2 && num[0] * 10 + num[1] >= 13)
	 {
		  System.out.printf("%d\n%d",(num[0] * 10 + num[1]) / 13,(num[0] * 10 + num[1]) % 13);
	 }
	 if (LEN == 2 && num[0] * 10 + num[1] < 13)
	 {
		  System.out.printf("%d\n%d",0,num[0] * 10 + num[1]);
	 }
	}



}

