package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sp;
	int[] st = new int[100];
	char ch;
	char boy;
	String tempVar = ConsoleInput.scanfRead(null, 1);
	if (tempVar != null)
	{
		boy = tempVar.charAt(0);
	}
	for (n = sp = 1;sp > 0;n++)
	{
		 String tempVar2 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar2 != null)
		 {
			 ch = tempVar2.charAt(0);
		 }
		 if (ch == boy)
		 {
			 st[sp] = n;
			 sp++;
		 }
		 else
		 {
			 sp--;
			System.out.printf("%d %d\n",st[sp],n);
		 }
	}
		return 0;
	}

}

