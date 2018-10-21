package <missing>;

public class GlobalMembers
{
	public static int pp(int a)
	{
	 int i;
	for (i = 2;i < a / 2 + 1;i++)
	{
	if (a % i == 0)
	{
		return 0;
		break;
	}
	}
	if (i == a / 2 + 1)
	{
		return 1;
	}
	}

	public static int ppp(int a,int b)
	{
	int[] m = new int[10];
	int i;
	for (i = 0;i < b;i++)
	{
	 m[i] = a % 10;
	 a = a / 10;
	}
	for (i = 0;i <= b / 2;i++)
	{
	 if (m[i] != m[b - i - 1])
	 {
		 break;
	 }
	}
	if (i == b / 2 + 1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}

	public static int qq(int a)
	{
	 int k;
	 for (k = 0;a > 0;k++)
	 {
	  a = a / 10;
	 }
	 return k;
	}


	public static void Main()
	{


	 int m;
	 int n;
	 int i;
	 int j;
	 int k = 0;
	 int b;
	 int c;
	 int v;


	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }



	 for (i = m;i <= n;i++)
	 {

	  b = pp(i);
	  if (b != 0)
	  {
		  j = qq(i);
	  c = ppp(i, j);
	  }



	  if (b * c != 0)
	  {
		  System.out.printf("%d",i);
		  k = 1;
		  v = i;
		  break;
	  }
	 }

	if (k != 0)
	{
	for (i = v + 1;i <= n;i++)
	{

	  b = pp(i);
	  if (b != 0)
	  {
		  j = qq(i);
	  c = ppp(i, j);
	  }



	  if (b * c != 0)
	  {
		  System.out.printf(",%d",i);
		  k = 1;
	  }
	}
	}


	 if (k == 0)
	 {
		 System.out.print("no");
	 }


	}


}

