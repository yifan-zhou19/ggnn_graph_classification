package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] p = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p[0] = n;
	 while (p[i] != 1)
	 {
		 if (p[i] % 2 == 0)
		 {
			p[i + 1] = p[i] / 2;
			i = i + 1;
			System.out.printf("%d/2=%d\n",p[i - 1],p[i]);
		 }
		 else if (p[i] % 2 != 0)
		 {
			p[i + 1] = p[i] * 3 + 1;
			i = i + 1;
			System.out.printf("%d*3+1=%d\n",p[i - 1],p[i]);
		 }
	 }
	 if (p[i] == 1)
	 {
		 System.out.print("End\n");
	 }



		return 0;
	}
}

