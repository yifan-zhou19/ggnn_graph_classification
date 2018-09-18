package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int q;
		int e;
		int n;
		int w;
		int m;
		int s;
		 int a;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 a = 1;
		 i = 0;
		 while (a != 0)
		 {
			 i++;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Integer.parseInt(tempVar2);
		 }
		 }
		 q = i;
		 m = n * n;
		 e = i;
		 w = 0;
		 for (j = i;j <= m;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a = Integer.parseInt(tempVar3);
			 }
		 if (a == 255)
		 {
			 w++;
		 }
		 if (a == 0)
		 {
			 e++;
			 e = e + w;
			 w = 0;
		 }
		 }
			  if ((q % n - e % n) >= 0)
			  {
			 s = ((e - e % n) / n - (q - q % n) / n - 1) * ((q % n - e % n) - 1);
			  }
			  else
			  {
				   s = ((e - e % n) / n - (q - q % n) / n - 1) * ((e % n - q % n) - 1);
			  }
		 System.out.printf("%ld",s);
		 return 0;
	}

}

