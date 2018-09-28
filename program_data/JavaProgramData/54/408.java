package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j = 0;
	int k;
	int m;
	int temp;
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
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	{
	 i = 1;
	 j = j + 1;
	 m = n * j + k;
	 do
	 {
	 if (m % (n - 1) == 0)
	 {
	 m = m / (n - 1) * n + k;
	 i++;
	 }
	 else
	 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 goto loop;
	 }
	 } while (i < n);
	 System.out.printf("%ld\n",m);
	}
	}

}

