package <missing>;

public class GlobalMembers
{
	public static int f1(int x)
	{
		int i;
		for (i = 2;i < x;i++)
		{
		if (x % i == 0)
		{
			return (0);
		}
		}
		return (1);
	}
	public static int f2(int x)
	{
		int[] t = new int[5];
		int i = 0;
		int len;
		int j;
		len = x;
		while (len != 0)
		{
			t[i] = len % 10;
		 len /= 10;
		 i++;
		}
		for (j = 0;j < i;j++)
		{
		if (t[j] != t[i - j - 1])
		{
			return (0);
		}
		}
		return (1);
	}
	public static int Main()
	{

	 int i;
	 int j;
	 int m;
	 int n;
	 int e = 0;
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
	 for (i = m;i <= n;i++)
	 {
	 if (f1(i) == 1 && f2(i) == 1)
	 {
		  if (e == 0)
		  {
			  System.out.printf("%d",i);
			  e++;
		  }
	   else
	   {
		   System.out.printf(",%d",i);
	   }
	 }
	 }
	  if (e == 0)
	  {
		  System.out.print("no");
	  }
	}

}

