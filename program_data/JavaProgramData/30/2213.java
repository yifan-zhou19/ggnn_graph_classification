package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int b;
	 int i;
	 int a = 0;
	 int s = 0;
	 int k = 0;
	 int d = 0;
	 int x = 0;
	 int r = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 b = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= b;i++)
	 {
	  if (i % 7 == 0)
	  {
	  s += i * i;
	  }
	  else if (i % 10 == 7)
	  {
	  k += i * i;
	  }
	  else if (i / 10 == 7)
	  {
	  d += i * i;
	  }
	 }
	 a = s + d + k;
	 for (i = 1;i <= b;i++)
	 {
	  r += i * i;
	 }
	 x = r - a;
	 System.out.printf("%d",x);
	 return 0;
	}
}

