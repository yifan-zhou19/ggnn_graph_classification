package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = int;
		pDelegate p;
		p = () -> f();
		for (i = 3;i < n / 2 + 1;i = i + 2)
		{
		  if (p.invoke(i) == 1 && p.invoke(n - i) == 1)
		  {
		   System.out.printf("%d %d\n",i,n - i);
		  }
		}
		 System.in.read();
		 System.in.read();
	}
     
	 @FunctionalInterface
	 interface pDelegate
	 {
		 int invoke(int UnnamedParameter);
	 }
	 public static int f(int a)
	 {
		int i;
		int c;
		for (i = 2;i < a;i++)
		{
		 if (a % i == 0)
		 {
			 break;
		 }
		}
		 if (i == a) //???
		 {
		 c = 1;
		 }
		 else
		 {
			 c = 2;
		 }
		 return (c);
	 }

}

