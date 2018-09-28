package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int x;
		int s;
		int q;
		int p;

	q = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}

	 q = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	s = q * n + k;
	i = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop2:
	x = s / (n - 1);
	 if (s % (n - 1) != 0)
	 {
		 q = q + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 goto loop;
	 };
	 if (s % (n - 1) == 0)
	 {
		 s = s + x + k;
		 i++;
		 if (i < n)
		 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			 goto loop2;
		 }
		 else
		 {
			 System.out.printf("%d",s);
		 }
	 }


	}
}

