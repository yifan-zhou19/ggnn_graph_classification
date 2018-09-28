package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int j;
	 j = 0;
	 for (i = 2;i < x;i++)
	 {
		 if (x % i == 0)
		 {
			  break;
		 }
	 }
	 if (i == x)
	 {
		 j = 1;
	 }
	 return (j);
	}

	public static int huiwenshu(int x)
	{
		int i;
		int j;
		int k;
		int p;
		int t;
	 k = 0;
	 p = 0;
	 for (i = 1;x / i != 0;i = i * 10)
	 {
	continue;
	 }
	 i = i / 10;
	 j = 1;
	 t = x;
	 for (i = i;i >= 1;i = i / 10)
	 {
		  k = k + x / i * j;
	   x = x - x / i * i;
	   j = j * 10;
	 }
	 if (t == k)
	 {
	   p = 1;
	 }
	 return (p);
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 j = 0;
	 for (i = m;i <= n;i++)
	 {
		  if (sushu(i) == 1 && huiwenshu(i) == 1)
		  {
			  if (j == 0)
			  {
			   System.out.printf("%d",i);
			j++;
			  }
		   else
		   {
			 System.out.printf(",%d",i);
		   }
		  }
	 }
	  if (j == 0)
	  {
	   System.out.print("no");
	  }
	}

}

